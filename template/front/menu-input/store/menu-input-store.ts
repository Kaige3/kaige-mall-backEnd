
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { MenuInputInput, MenuInputSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { MenuInputDto } from '@/apis/__generated/model/dto'

export const useMenuInputStore = defineStore('menuInput', () => {
  const initQuery: MenuInputSpec = {}
  const initForm: MenuInputInput = {  }
  const tableHelper = useTableHelper(api.menuInputController.query, api.menuInputController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<MenuInputSpec>(initQuery)
  const updateForm =ref<MenuInputInput>({...initForm})
  const createForm = ref<MenuInputInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
