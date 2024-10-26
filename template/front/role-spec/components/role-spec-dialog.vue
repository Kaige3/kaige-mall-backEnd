<script lang="ts" setup>
  import { type Component } from 'vue'
  import { storeToRefs } from 'pinia'
  import { useRoleSpecStore } from '../store/role-spec-store'
  import RoleSpecCreateForm from './role-spec-create-form.vue'
  import RoleSpecUpdateForm from './role-spec-update-form.vue'
  import type { EditMode } from '@/typings'
  const roleSpecStore = useRoleSpecStore()
  const { dialogData } = storeToRefs(roleSpecStore)

  const formMap: Record<EditMode, Component> = {
    CREATE: RoleSpecCreateForm,
    UPDATE: RoleSpecUpdateForm
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