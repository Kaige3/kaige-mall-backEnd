<script lang="ts" setup>
  import { type Component } from 'vue'
  import { storeToRefs } from 'pinia'
  import { useMysteryBoxCategoryStore } from '../store/mystery-box-category-store'
  import MysteryBoxCategoryCreateForm from './mystery-box-category-create-form.vue'
  import MysteryBoxCategoryUpdateForm from './mystery-box-category-update-form.vue'
  import type { EditMode } from '@/typings'
  const mysteryBoxCategoryStore = useMysteryBoxCategoryStore()
  const { dialogData } = storeToRefs(mysteryBoxCategoryStore)

  const formMap: Record<EditMode, Component> = {
    CREATE: MysteryBoxCategoryCreateForm,
    UPDATE: MysteryBoxCategoryUpdateForm
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