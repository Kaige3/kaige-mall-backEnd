
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { MysteryBoxCategoryInputInput, MysteryBoxCategoryInputSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { MysteryBoxCategoryInputDto } from '@/apis/__generated/model/dto'

export const useMysteryBoxCategoryInputStore = defineStore('mysteryBoxCategoryInput', () => {
  const initQuery: MysteryBoxCategoryInputSpec = {}
  const initForm: MysteryBoxCategoryInputInput = {  }
  const tableHelper = useTableHelper(api.mysteryBoxCategoryInputController.query, api.mysteryBoxCategoryInputController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<MysteryBoxCategoryInputSpec>(initQuery)
  const updateForm =ref<MysteryBoxCategoryInputInput>({...initForm})
  const createForm = ref<MysteryBoxCategoryInputInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
