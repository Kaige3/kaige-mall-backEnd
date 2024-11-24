<script lang="ts" setup>
  import { type Component } from 'vue'
  import { storeToRefs } from 'pinia'
  import { useMenuSpecStore } from '../store/menu-spec-store'
  import MenuSpecCreateForm from './menu-spec-create-form.vue'
  import MenuSpecUpdateForm from './menu-spec-update-form.vue'
  import type { EditMode } from '@/typings'
  const menuSpecStore = useMenuSpecStore()
  const { dialogData } = storeToRefs(menuSpecStore)

  const formMap: Record<EditMode, Component> = {
    CREATE: MenuSpecCreateForm,
    UPDATE: MenuSpecUpdateForm
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