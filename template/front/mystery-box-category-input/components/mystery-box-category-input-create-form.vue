<script lang="ts" setup>
    import {storeToRefs} from 'pinia'
    import { reactive, ref, watch } from 'vue'
    import {useMysteryBoxCategoryInputStore} from '../store/mystery-box-category-input-store'
    import { assertFormValidate, assertSuccess } from '@/utils/common'
    import {api} from '@/utils/api-instance'
    import ImageUpload from '@/components/image/image-upload.vue'
    import FooterButton from '@/components/base/dialog/footer-button.vue'
    import DictSelect from '@/components/dict/dict-select.vue'
    import type { FormInstance, FormRules } from 'element-plus'
    import { DictConstants } from '@/apis/__generated/model/enums/DictConstants'

    const mysteryBoxCategoryInputStore = useMysteryBoxCategoryInputStore()
    const {closeDialog, reloadTableData} = mysteryBoxCategoryInputStore
    const {createForm, dialogData} = storeToRefs(mysteryBoxCategoryInputStore)
    const createFormRef = ref<FormInstance>()
    const rules = reactive<FormRules<typeof createForm>>({
        "getName": [{ required: true, message: '请输入类别名称', trigger: "blur"}],
        "getIcon": [{ required: true, message: '请输入类别图标', trigger: "blur"}],
        "getDescription": [{ required: true, message: '请输入描述', trigger: "blur"}],
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
                api.mysteryBoxCategoryInputController.save({body: createForm.value}).then(async (res) => {
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
    <el-form-item label="类别名称" prop="getName">
                <el-input v-model="createForm.getName"></el-input>
    </el-form-item>
    <el-form-item label="类别图标" prop="getIcon">
                <image-upload v-model="createForm.getIcon"></image-upload>
    </el-form-item>
    <el-form-item label="描述" prop="getDescription">
                <el-input v-model="createForm.getDescription"></el-input>
    </el-form-item>
    <el-form-item label="排序" prop="getSortOrder">
                <el-input-number v-model="createForm.getSortOrder"></el-input-number>
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

