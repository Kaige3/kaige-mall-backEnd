import type { MenuDto, UserDto } from "@/apis/__generated/model/dto"
import type { MenuTreeDto } from "@/typings"
import { api } from "@/utils/api-instance"
import { buildMenuTree } from "@/views/menu/store/menu-store"
import { defineStore } from "pinia"
import { ref } from "vue"

export const useHomeStore = defineStore('home', () => {
    const userInfo = ref<UserDto['UserRepository/COMPLEX_FETCHER']>({
        createdTime: '',
        editedTime: '',
        id: '',
        nickname: '',
        password: '',
        phone: '',
        status:''
    })
    const menuList = ref<MenuDto['MenuRepository/SIMPLE_FETCHER'][]>([])
    const menuTreeList = ref<MenuTreeDto[]>([])
    const getUserInfo = async () => {
        userInfo.value = await api.userForFrontController.getUserInfo()
    }
    
    const getMenuList = async () => {
        if (menuList.value.length > 0) return menuList.value
        // 获取用户菜单
        const res = await api.userForFrontController.getUserMenus()
        // 缓存菜单列表
        menuList.value = res
        // 递归生成菜单树
        menuTreeList.value = buildMenuTree(null, res)
        return res
    }
    const init = async () => {
        await getUserInfo()
        await getMenuList()
    }
    
    init()
    return { userInfo, getUserInfo, getMenuList, init, menuList, menuTreeList }
    })
    