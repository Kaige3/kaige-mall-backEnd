
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { DictInputInput, DictInputSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { DictInputDto } from '@/apis/__generated/model/dto'

export const useDictInputStore = defineStore('dictInput', () => {
  const initQuery: DictInputSpec = {}
  const initForm: DictInputInput = {  }
  const tableHelper = useTableHelper(api.dictInputController.query, api.dictInputController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<DictInputSpec>(initQuery)
  const updateForm =ref<DictInputInput>({...initForm})
  const createForm = ref<DictInputInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
