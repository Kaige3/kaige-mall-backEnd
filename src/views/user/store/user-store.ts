
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { UserInput, UserSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { UserDto } from '@/apis/__generated/model/dto'

export const useUserStore = defineStore('user', () => {
  const initQuery: UserSpec = {}
  const initForm: UserInput = {
    phone: '',
    id:'',
    password: '',
    status: 'NORMAL',
    roleIds: [],
  }
  const tableHelper = useTableHelper(api.userForFrontController.query, api.userForFrontController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<UserSpec>(initQuery)
  const updateForm =ref<UserInput>({...initForm})
  const createForm = ref<UserInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
