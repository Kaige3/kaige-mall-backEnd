
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { MysteryBoxCategorySpecInput, MysteryBoxCategorySpecSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { MysteryBoxCategorySpecDto } from '@/apis/__generated/model/dto'

export const useMysteryBoxCategorySpecStore = defineStore('mysteryBoxCategorySpec', () => {
  const initQuery: MysteryBoxCategorySpecSpec = {}
  const initForm: MysteryBoxCategorySpecInput = {  }
  const tableHelper = useTableHelper(api.mysteryBoxCategorySpecController.query, api.mysteryBoxCategorySpecController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<MysteryBoxCategorySpecSpec>(initQuery)
  const updateForm =ref<MysteryBoxCategorySpecInput>({...initForm})
  const createForm = ref<MysteryBoxCategorySpecInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
