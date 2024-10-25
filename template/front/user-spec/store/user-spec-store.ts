
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { UserSpecInput, UserSpecSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { UserSpecDto } from '@/apis/__generated/model/dto'

export const useUserSpecStore = defineStore('userSpec', () => {
  const initQuery: UserSpecSpec = {}
  const initForm: UserSpecInput = {  }
  const tableHelper = useTableHelper(api.userSpecController.query, api.userSpecController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<UserSpecSpec>(initQuery)
  const updateForm =ref<UserSpecInput>({...initForm})
  const createForm = ref<UserSpecInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
