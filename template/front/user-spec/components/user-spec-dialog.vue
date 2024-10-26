<script lang="ts" setup>
  import { type Component } from 'vue'
  import { storeToRefs } from 'pinia'
  import { useUserSpecStore } from '../store/user-spec-store'
  import UserSpecCreateForm from './user-spec-create-form.vue'
  import UserSpecUpdateForm from './user-spec-update-form.vue'
  import type { EditMode } from '@/typings'
  const userSpecStore = useUserSpecStore()
  const { dialogData } = storeToRefs(userSpecStore)

  const formMap: Record<EditMode, Component> = {
    CREATE: UserSpecCreateForm,
    UPDATE: UserSpecUpdateForm
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