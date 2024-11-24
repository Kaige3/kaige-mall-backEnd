<script lang="ts" setup>
  import { type Component } from 'vue'
  import { storeToRefs } from 'pinia'
  import { useMenuInputStore } from '../store/menu-input-store'
  import MenuInputCreateForm from './menu-input-create-form.vue'
  import MenuInputUpdateForm from './menu-input-update-form.vue'
  import type { EditMode } from '@/typings'
  const menuInputStore = useMenuInputStore()
  const { dialogData } = storeToRefs(menuInputStore)

  const formMap: Record<EditMode, Component> = {
    CREATE: MenuInputCreateForm,
    UPDATE: MenuInputUpdateForm
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