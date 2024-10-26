<script lang="ts" setup>
    import {storeToRefs} from 'pinia'
    import { reactive, ref, watch } from 'vue'
    import {useMenuStore} from '../store/menu-store'
    import { assertFormValidate, assertSuccess } from '@/utils/common'
    import {api} from '@/utils/api-instance'
    import ImageUpload from '@/components/image/image-upload.vue'
    import FooterButton from '@/components/base/dialog/footer-button.vue'
    import DictSelect from '@/components/dict/dict-select.vue'
    import type { FormInstance, FormRules } from 'element-plus'
    import { DictConstants } from '@/apis/__generated/model/enums/DictConstants'

    const menuStore = useMenuStore()
    const {closeDialog, reloadTableData} = menuStore
    const {createForm, dialogData} = storeToRefs(menuStore)
    const createFormRef = ref<FormInstance>()
    const rules = reactive<FormRules<typeof createForm>>({
        "name": [{ required: true, message: '请输入菜单名称', trigger: "blur"}],
        "path": [{ required: true, message: '请输入菜单路径', trigger: "blur"}],
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
                api.menuController.save({body: createForm.value}).then(async (res) => {
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
    <el-form-item label="菜单名称" prop="name">
                <el-input v-model="createForm.name"></el-input>
    </el-form-item>
    <el-form-item label="父级菜单" prop="parentId">
                <el-input v-model="createForm.parentId"></el-input>
    </el-form-item>
    <el-form-item label="菜单路径" prop="path">
                <el-input v-model="createForm.path"></el-input>
    </el-form-item>
    <el-form-item label="排序" prop="orderNum">
                <el-input-number v-model="createForm.orderNum"></el-input-number>
    </el-form-item>
    <el-form-item label="图标" prop="icon">
                <image-upload v-model="createForm.icon"></image-upload>
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

