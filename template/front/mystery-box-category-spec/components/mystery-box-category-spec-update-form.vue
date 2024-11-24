<script lang="ts" setup>
    import {storeToRefs} from 'pinia'
    import { reactive, ref, watch } from 'vue'
    import {useMysteryBoxCategorySpecStore} from '../store/mystery-box-category-spec-store'
    import { assertFormValidate, assertSuccess } from '@/utils/common'
    import {api} from '@/utils/api-instance'
    import ImageUpload from '@/components/image/image-upload.vue'
    import FooterButton from '@/components/base/dialog/footer-button.vue'
    import DictSelect from '@/components/dict/dict-select.vue'
    import type { FormInstance, FormRules } from 'element-plus'
    import { DictConstants } from '@/apis/__generated/model/enums/DictConstants'

    const mysteryBoxCategorySpecStore = useMysteryBoxCategorySpecStore()
    const {closeDialog, reloadTableData} = mysteryBoxCategorySpecStore
    const {updateForm, dialogData} = storeToRefs(mysteryBoxCategorySpecStore)
    const updateFormRef = ref<FormInstance>()
    const rules = reactive<FormRules<typeof updateForm>>({
        "getName": [{ required: true, message: '请输入类别名称', trigger: "blur"}],
        "getIcon": [{ required: true, message: '请输入类别图标', trigger: "blur"}],
        "getDescription": [{ required: true, message: '请输入描述', trigger: "blur"}],
    })
    const init = async () => {
        dialogData.value.title = '编辑'
        updateForm.value = {
            ...await api.mysteryBoxCategorySpecController.findById({id: updateForm.value.id || ''})
        }
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

        updateFormRef.value?.validate(
            assertFormValidate(() => {
                api.mysteryBoxCategorySpecController.save({body: updateForm.value}).then(async (res) => {
                    assertSuccess(res).then(() => {
                        closeDialog()
                        reloadTableData()
                    })
                })
            })
        )

    }
</script>
<template>
    <div class="update-form">
        <el-form labelWidth="120" class="form" ref="updateFormRef" :model="updateForm" :rules="rules">
    <el-form-item label="类别名称" prop="getName">
                <el-input v-model="updateForm.getName"></el-input>
    </el-form-item>
    <el-form-item label="类别图标" prop="getIcon">
                <image-upload v-model="updateForm.getIcon"></image-upload>
    </el-form-item>
    <el-form-item label="描述" prop="getDescription">
                <el-input v-model="updateForm.getDescription"></el-input>
    </el-form-item>
    <el-form-item label="排序" prop="getSortOrder">
                <el-input-number v-model="updateForm.getSortOrder"></el-input-number>
    </el-form-item>
        </el-form>
        <footer-button @close="closeDialog" @confirm="handleConfirm"></footer-button>
    </div>
</template>

<style lang="scss" scoped>
    .update-form{
      margin-right: 30px;
    }
</style>

