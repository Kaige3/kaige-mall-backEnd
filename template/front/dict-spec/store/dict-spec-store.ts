
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { DictSpecInput, DictSpecSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { DictSpecDto } from '@/apis/__generated/model/dto'

export const useDictSpecStore = defineStore('dictSpec', () => {
  const initQuery: DictSpecSpec = {}
  const initForm: DictSpecInput = {  }
  const tableHelper = useTableHelper(api.dictSpecController.query, api.dictSpecController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<DictSpecSpec>(initQuery)
  const updateForm =ref<DictSpecInput>({...initForm})
  const createForm = ref<DictSpecInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
