<script lang="ts" setup>
  import { type Component } from 'vue'
  import { storeToRefs } from 'pinia'
  import { useUserLoginInputStore } from '../store/user-login-input-store'
  import UserLoginInputCreateForm from './user-login-input-create-form.vue'
  import UserLoginInputUpdateForm from './user-login-input-update-form.vue'
  import type { EditMode } from '@/typings'
  const userLoginInputStore = useUserLoginInputStore()
  const { dialogData } = storeToRefs(userLoginInputStore)

  const formMap: Record<EditMode, Component> = {
    CREATE: UserLoginInputCreateForm,
    UPDATE: UserLoginInputUpdateForm
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