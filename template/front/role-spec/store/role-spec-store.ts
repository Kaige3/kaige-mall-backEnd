
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { RoleSpecInput, RoleSpecSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { RoleSpecDto } from '@/apis/__generated/model/dto'

export const useRoleSpecStore = defineStore('roleSpec', () => {
  const initQuery: RoleSpecSpec = {}
  const initForm: RoleSpecInput = {  }
  const tableHelper = useTableHelper(api.roleSpecController.query, api.roleSpecController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<RoleSpecSpec>(initQuery)
  const updateForm =ref<RoleSpecInput>({...initForm})
  const createForm = ref<RoleSpecInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
