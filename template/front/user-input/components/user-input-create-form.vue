<script lang="ts" setup>
    import {storeToRefs} from 'pinia'
    import { reactive, ref, watch } from 'vue'
    import {useUserInputStore} from '../store/user-input-store'
    import { assertFormValidate, assertSuccess } from '@/utils/common'
    import {api} from '@/utils/api-instance'
    import ImageUpload from '@/components/image/image-upload.vue'
    import FooterButton from '@/components/base/dialog/footer-button.vue'
    import DictSelect from '@/components/dict/dict-select.vue'
    import type { FormInstance, FormRules } from 'element-plus'
    import { DictConstants } from '@/apis/__generated/model/enums/DictConstants'

    const userInputStore = useUserInputStore()
    const {closeDialog, reloadTableData} = userInputStore
    const {createForm, dialogData} = storeToRefs(userInputStore)
    const createFormRef = ref<FormInstance>()
    const rules = reactive<FormRules<typeof createForm>>({
        "getPhone": [{ required: true, message: '请输入手机号', trigger: "blur"}],
        "getPassword": [{ required: true, message: '请输入密码', trigger: "blur"}],
        "getNickname": [{ required: true, message: '请输入昵称', trigger: "blur"}],
        "getAvatar": [{ required: true, message: '请输入头像', trigger: "blur"}],
        "getGender": [{ required: true, message: '请输入性别', trigger: "blur"}],
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
                api.userInputController.save({body: createForm.value}).then(async (res) => {
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
    <el-form-item label="手机号" prop="getPhone">
                <el-input v-model="createForm.getPhone"></el-input>
    </el-form-item>
    <el-form-item label="密码" prop="getPassword">
                <el-input v-model="createForm.getPassword"></el-input>
    </el-form-item>
    <el-form-item label="昵称" prop="getNickname">
                <el-input v-model="createForm.getNickname"></el-input>
    </el-form-item>
    <el-form-item label="头像" prop="getAvatar">
                <image-upload v-model="createForm.getAvatar"></image-upload>
    </el-form-item>
    <el-form-item label="性别" prop="getGender">
                <el-input v-model="createForm.getGender"></el-input>
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

