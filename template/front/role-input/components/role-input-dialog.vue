<script lang="ts" setup>
  import { type Component } from 'vue'
  import { storeToRefs } from 'pinia'
  import { useRoleInputStore } from '../store/role-input-store'
  import RoleInputCreateForm from './role-input-create-form.vue'
  import RoleInputUpdateForm from './role-input-update-form.vue'
  import type { EditMode } from '@/typings'
  const roleInputStore = useRoleInputStore()
  const { dialogData } = storeToRefs(roleInputStore)

  const formMap: Record<EditMode, Component> = {
    CREATE: RoleInputCreateForm,
    UPDATE: RoleInputUpdateForm
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