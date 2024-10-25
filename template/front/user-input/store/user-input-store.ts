
import { defineStore } from 'pinia'
import { useTableHelper } from '@/components/base/table/table-helper'
import { useDialogHelper } from '@/components/base/dialog/dialog-helper'
import { useQueryHelper } from '@/components/base/query/query-helper'
import type { UserInputInput, UserInputSpec } from '@/apis/__generated/model/static'
import { api } from '@/utils/api-instance'
import { ref } from 'vue'
import type { UserInputDto } from '@/apis/__generated/model/dto'

export const useUserInputStore = defineStore('userInput', () => {
  const initQuery: UserInputSpec = {}
  const initForm: UserInputInput = {  }
  const tableHelper = useTableHelper(api.userInputController.query, api.userInputController, initQuery)
  const dialogHelper = useDialogHelper()
  const queryHelper = useQueryHelper<UserInputSpec>(initQuery)
  const updateForm =ref<UserInputInput>({...initForm})
  const createForm = ref<UserInputInput>({...initForm})
  return { ...tableHelper, ...dialogHelper, ...queryHelper, updateForm, createForm, initForm}
})
