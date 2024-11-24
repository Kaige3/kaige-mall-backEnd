
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { MysteryBoxCategoryInput, MysteryBoxCategorySpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { MysteryBoxCategoryDto } from '@/apis/__generated/model/dto'

export const useMysteryBoxCategoryStore = defineStore('mysteryBoxCategory', () => {
  const initQuery: MysteryBoxCategorySpec = {}
  const initForm: MysteryBoxCategoryInput = {  }
  const tableHelper = useTableHelper(api.mysteryBoxCategoryController.query, api.mysteryBoxCategoryController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<MysteryBoxCategorySpec>(initQuery)
  const updateForm =ref<MysteryBoxCategoryInput>({...initForm})
  const createForm = ref<MysteryBoxCategoryInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
