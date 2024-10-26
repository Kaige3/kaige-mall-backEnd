<script lang="ts" setup>
    import {storeToRefs} from 'pinia'
    import { reactive, ref, watch } from 'vue'
    import {useDictSpecStore} from '../store/dict-spec-store'
    import { assertFormValidate, assertSuccess } from '@/utils/common'
    import {api} from '@/utils/api-instance'
    import ImageUpload from '@/components/image/image-upload.vue'
    import FooterButton from '@/components/base/dialog/footer-button.vue'
    import DictSelect from '@/components/dict/dict-select.vue'
    import type { FormInstance, FormRules } from 'element-plus'
    import { DictConstants } from '@/apis/__generated/model/enums/DictConstants'

    const dictSpecStore = useDictSpecStore()
    const {closeDialog, reloadTableData} = dictSpecStore
    const {createForm, dialogData} = storeToRefs(dictSpecStore)
    const createFormRef = ref<FormInstance>()
    const rules = reactive<FormRules<typeof createForm>>({
        "getKeyName": [{ required: true, message: '请输入值名称', trigger: "blur"}],
        "getKeyEnName": [{ required: true, message: '请输入值英文名称', trigger: "blur"}],
        "getDictName": [{ required: true, message: '请输入字典名称', trigger: "blur"}],
        "getDictEnName": [{ required: true, message: '请输入字段英文名称', trigger: "blur"}],
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
                api.dictSpecController.save({body: createForm.value}).then(async (res) => {
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
    <el-form-item label="值编号" prop="getKeyId">
                <el-input-number v-model="createForm.getKeyId"></el-input-number>
    </el-form-item>
    <el-form-item label="值名称" prop="getKeyName">
                <el-input v-model="createForm.getKeyName"></el-input>
    </el-form-item>
    <el-form-item label="值英文名称" prop="getKeyEnName">
                <el-input v-model="createForm.getKeyEnName"></el-input>
    </el-form-item>
    <el-form-item label="字典编号" prop="getDictId">
                <el-input-number v-model="createForm.getDictId"></el-input-number>
    </el-form-item>
    <el-form-item label="字典名称" prop="getDictName">
                <el-input v-model="createForm.getDictName"></el-input>
    </el-form-item>
    <el-form-item label="字段英文名称" prop="getDictEnName">
                <el-input v-model="createForm.getDictEnName"></el-input>
    </el-form-item>
    <el-form-item label="排序号" prop="getOrderNum">
                <el-input-number v-model="createForm.getOrderNum"></el-input-number>
    </el-form-item>
    <el-form-item label="是否可见" prop="getVisible">
                <el-input-number v-model="createForm.getVisible"></el-input-number>
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

