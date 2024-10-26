
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { RoleInputInput, RoleInputSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { RoleInputDto } from '@/apis/__generated/model/dto'

export const useRoleInputStore = defineStore('roleInput', () => {
  const initQuery: RoleInputSpec = {}
  const initForm: RoleInputInput = {  }
  const tableHelper = useTableHelper(api.roleInputController.query, api.roleInputController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<RoleInputSpec>(initQuery)
  const updateForm =ref<RoleInputInput>({...initForm})
  const createForm = ref<RoleInputInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
