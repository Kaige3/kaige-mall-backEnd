<script lang="ts" setup>
    import {storeToRefs} from 'pinia'
    import { reactive, ref, watch } from 'vue'
    import {useRoleStore} from '../store/role-store'
    import { assertFormValidate, assertSuccess } from '@/utils/common'
    import {api} from '@/utils/api-instance'
    import ImageUpload from '@/components/image/image-upload.vue'
    import FooterButton from '@/components/base/dialog/footer-button.vue'
    import DictSelect from '@/components/dict/dict-select.vue'
    import type { FormInstance, FormRules } from 'element-plus'
    import { DictConstants } from '@/apis/__generated/model/enums/DictConstants'

    const roleStore = useRoleStore()
    const {closeDialog, reloadTableData} = roleStore
    const {updateForm, dialogData} = storeToRefs(roleStore)
    const updateFormRef = ref<FormInstance>()
    const rules = reactive<FormRules<typeof updateForm>>({
        "name": [{ required: true, message: '请输入角色名称', trigger: "blur"}],
    })
    const init = async () => {
        dialogData.value.title = '编辑'
        updateForm.value = {
            ...await api.roleController.findById({id: updateForm.value.id || ''})
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
                api.roleController.save({body: updateForm.value}).then(async (res) => {
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
    <el-form-item label="角色名称" prop="name">
                <el-input v-model="updateForm.name"></el-input>
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

