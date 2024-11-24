<script lang="ts" setup>
    import {storeToRefs} from 'pinia'
    import { reactive, ref, watch } from 'vue'
    import {useMysteryBoxCategoryStore} from '../store/mystery-box-category-store'
    import { assertFormValidate, assertSuccess } from '@/utils/common'
    import {api} from '@/utils/api-instance'
    import ImageUpload from '@/components/image/image-upload.vue'
    import FooterButton from '@/components/base/dialog/footer-button.vue'
    import DictSelect from '@/components/dict/dict-select.vue'
    import type { FormInstance, FormRules } from 'element-plus'
    import { DictConstants } from '@/apis/__generated/model/enums/DictConstants'

    const mysteryBoxCategoryStore = useMysteryBoxCategoryStore()
    const {closeDialog, reloadTableData} = mysteryBoxCategoryStore
    const {updateForm, dialogData} = storeToRefs(mysteryBoxCategoryStore)
    const updateFormRef = ref<FormInstance>()
    const rules = reactive<FormRules<typeof updateForm>>({
    })
    const init = async () => {
        dialogData.value.title = '编辑'
        updateForm.value = {
            ...await api.mysteryBoxCategoryController.findById({id: updateForm.value.id || ''})
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
                api.mysteryBoxCategoryController.save({body: updateForm.value}).then(async (res) => {
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
    <el-form-item label="类别名称" prop="name">
                <el-input v-model="updateForm.name"></el-input>
    </el-form-item>
    <el-form-item label="类别图标" prop="icon">
                <image-upload v-model="updateForm.icon"></image-upload>
    </el-form-item>
    <el-form-item label="描述" prop="description">
                <el-input v-model="updateForm.description"></el-input>
    </el-form-item>
    <el-form-item label="排序" prop="sortOrder">
                <el-input-number v-model="updateForm.sortOrder"></el-input-number>
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

