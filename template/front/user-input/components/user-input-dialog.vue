<script lang="ts" setup>
  import { type Component } from 'vue'
  import { storeToRefs } from 'pinia'
  import { useUserInputStore } from '../store/user-input-store'
  import UserInputCreateForm from './user-input-create-form.vue'
  import UserInputUpdateForm from './user-input-update-form.vue'
  import type { EditMode } from '@/typings'
  const userInputStore = useUserInputStore()
  const { dialogData } = storeToRefs(userInputStore)

  const formMap: Record<EditMode, Component> = {
    CREATE: UserInputCreateForm,
    UPDATE: UserInputUpdateForm
  }
</script>
<template>
  <div>
    <el-dialog v-model="dialogData.visible" :title="dialogData.title" :width="dialogData.width">
      <component :is="formMap[dialogData.mode]"></component>
    </el-dialog>
  </div>
</template>

<style lang="scss" scoped></style>