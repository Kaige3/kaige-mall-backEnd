
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { UserLoginInputInput, UserLoginInputSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { UserLoginInputDto } from '@/apis/__generated/model/dto'

export const useUserLoginInputStore = defineStore('userLoginInput', () => {
  const initQuery: UserLoginInputSpec = {}
  const initForm: UserLoginInputInput = {  }
  const tableHelper = useTableHelper(api.userLoginInputController.query, api.userLoginInputController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<UserLoginInputSpec>(initQuery)
  const updateForm =ref<UserLoginInputInput>({...initForm})
  const createForm = ref<UserLoginInputInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
