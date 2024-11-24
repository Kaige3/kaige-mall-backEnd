
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { MenuSpecInput, MenuSpecSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { MenuSpecDto } from '@/apis/__generated/model/dto'

export const useMenuSpecStore = defineStore('menuSpec', () => {
  const initQuery: MenuSpecSpec = {}
  const initForm: MenuSpecInput = {  }
  const tableHelper = useTableHelper(api.menuSpecController.query, api.menuSpecController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<MenuSpecSpec>(initQuery)
  const updateForm =ref<MenuSpecInput>({...initForm})
  const createForm = ref<MenuSpecInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
