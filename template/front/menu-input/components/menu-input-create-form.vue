<script lang="ts" setup>
    import {storeToRefs} from 'pinia'
    import { reactive, ref, watch } from 'vue'
    import {useMenuInputStore} from '../store/menu-input-store'
    import { assertFormValidate, assertSuccess } from '@/utils/common'
    import {api} from '@/utils/api-instance'
    import ImageUpload from '@/components/image/image-upload.vue'
    import FooterButton from '@/components/base/dialog/footer-button.vue'
    import DictSelect from '@/components/dict/dict-select.vue'
    import type { FormInstance, FormRules } from 'element-plus'
    import { DictConstants } from '@/apis/__generated/model/enums/DictConstants'

    const menuInputStore = useMenuInputStore()
    const {closeDialog, reloadTableData} = menuInputStore
    const {createForm, dialogData} = storeToRefs(menuInputStore)
    const createFormRef = ref<FormInstance>()
    const rules = reactive<FormRules<typeof createForm>>({
        "getName": [{ required: true, message: '请输入菜单名称', trigger: "blur"}],
        "getParentId": [{ required: true, message: '请输入父级菜单', trigger: "blur"}],
        "getPath": [{ required: true, message: '请输入菜单路径', trigger: "blur"}],
        "getIcon": [{ required: true, message: '请输入图标', trigger: "blur"}],
    })
    const init = async () => {
        dialogData.value.title = '创建'
    }
    watch(
        () => dialogData.value.visible,
        (value) => {
            if (value) {
                init()
            }
        },
        {immediate: true}
    )

    const handleConfirm = () => {
        createFormRef.value?.validate(
            assertFormValidate(() =>
                api.menuInputController.save({body: createForm.value}).then(async (res) => {
                    assertSuccess(res).then(() => {
                        closeDialog()
                        reloadTableData()
                    })
                })
            )
        )

    }
</script>
<template>
    <div class="create-form">
        <el-form labelWidth="120" class="form" ref="createFormRef" :model="createForm" :rules="rules">
    <el-form-item label="菜单名称" prop="getName">
                <el-input v-model="createForm.getName"></el-input>
    </el-form-item>
    <el-form-item label="父级菜单" prop="getParentId">
                <el-input v-model="createForm.getParentId"></el-input>
    </el-form-item>
    <el-form-item label="菜单路径" prop="getPath">
                <el-input v-model="createForm.getPath"></el-input>
    </el-form-item>
    <el-form-item label="排序" prop="getOrderNum">
                <el-input-number v-model="createForm.getOrderNum"></el-input-number>
    </el-form-item>
    <el-form-item label="菜单类型" prop="getMenuType">
                <dict-select :dict-id="DictConstants.MENU_TYPE" v-model="createForm.getMenuType"></dict-select>
    </el-form-item>
    <el-form-item label="图标" prop="getIcon">
                <image-upload v-model="createForm.getIcon"></image-upload>
    </el-form-item>
        </el-form>
        <footer-button @close="closeDialog" @confirm="handleConfirm"></footer-button>
    </div>
</template>

<style lang="scss" scoped>
    .create-form{
      margin-right: 30px;
    }
</style>

