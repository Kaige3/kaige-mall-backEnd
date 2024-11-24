<script lang="ts" setup>
  import { type Component } from 'vue'
  import { storeToRefs } from 'pinia'
  import { useMysteryBoxCategoryInputStore } from '../store/mystery-box-category-input-store'
  import MysteryBoxCategoryInputCreateForm from './mystery-box-category-input-create-form.vue'
  import MysteryBoxCategoryInputUpdateForm from './mystery-box-category-input-update-form.vue'
  import type { EditMode } from '@/typings'
  const mysteryBoxCategoryInputStore = useMysteryBoxCategoryInputStore()
  const { dialogData } = storeToRefs(mysteryBoxCategoryInputStore)

  const formMap: Record<EditMode, Component> = {
    CREATE: MysteryBoxCategoryInputCreateForm,
    UPDATE: MysteryBoxCategoryInputUpdateForm
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