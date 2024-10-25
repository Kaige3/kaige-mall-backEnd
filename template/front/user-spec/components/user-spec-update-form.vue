<script lang="ts" setup>
    import {storeToRefs} from 'pinia'
    import { reactive, ref, watch } from 'vue'
    import {useUserSpecStore} from '../store/user-spec-store'
    import { assertFormValidate, assertSuccess } from '@/utils/common'
    import {api} from '@/utils/api-instance'
    import ImageUpload from '@/components/image/image-upload.vue'
    import FooterButton from '@/components/base/dialog/footer-button.vue'
    import DictSelect from '@/components/dict/dict-select.vue'
    import type { FormInstance, FormRules } from 'element-plus'
    import { DictConstants } from '@/apis/__generated/model/enums/DictConstants'

    const userSpecStore = useUserSpecStore()
    const {closeDialog, reloadTableData} = userSpecStore
    const {updateForm, dialogData} = storeToRefs(userSpecStore)
    const updateFormRef = ref<FormInstance>()
    const rules = reactive<FormRules<typeof updateForm>>({
        "getPhone": [{ required: true, message: '请输入手机号', trigger: "blur"}],
        "getPassword": [{ required: true, message: '请输入密码', trigger: "blur"}],
        "getNickname": [{ required: true, message: '请输入昵称', trigger: "blur"}],
        "getAvatar": [{ required: true, message: '请输入头像', trigger: "blur"}],
        "getGender": [{ required: true, message: '请输入性别', trigger: "blur"}],
    })
    const init = async () => {
        dialogData.value.title = '编辑'
        updateForm.value = {
            ...await api.userSpecController.findById({id: updateForm.value.id || ''})
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
                api.userSpecController.save({body: updateForm.value}).then(async (res) => {
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
    <el-form-item label="手机号" prop="getPhone">
                <el-input v-model="updateForm.getPhone"></el-input>
    </el-form-item>
    <el-form-item label="密码" prop="getPassword">
                <el-input v-model="updateForm.getPassword"></el-input>
    </el-form-item>
    <el-form-item label="昵称" prop="getNickname">
                <el-input v-model="updateForm.getNickname"></el-input>
    </el-form-item>
    <el-form-item label="头像" prop="getAvatar">
                <image-upload v-model="updateForm.getAvatar"></image-upload>
    </el-form-item>
    <el-form-item label="性别" prop="getGender">
                <el-input v-model="updateForm.getGender"></el-input>
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

