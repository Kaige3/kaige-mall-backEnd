
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { DictInput, DictSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { DictDto } from '@/apis/__generated/model/dto'

export const useDictStore = defineStore('dict', () => {
  const initQuery: DictSpec = {}
  
  const initForm: DictInput = {
    keyEnName: '',
    keyName: '',
    dictName: '',
    dictEnName: '',
    visible: false
  }
  const tableHelper = useTableHelper(api.dictController.query, api.dictController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<DictSpec>(initQuery)
  const updateForm =ref<DictInput>({...initForm})
  const createForm = ref<DictInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
