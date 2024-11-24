<script lang="ts" setup>
  import { type Component } from 'vue'
  import { storeToRefs } from 'pinia'
  import { useMysteryBoxCategorySpecStore } from '../store/mystery-box-category-spec-store'
  import MysteryBoxCategorySpecCreateForm from './mystery-box-category-spec-create-form.vue'
  import MysteryBoxCategorySpecUpdateForm from './mystery-box-category-spec-update-form.vue'
  import type { EditMode } from '@/typings'
  const mysteryBoxCategorySpecStore = useMysteryBoxCategorySpecStore()
  const { dialogData } = storeToRefs(mysteryBoxCategorySpecStore)

  const formMap: Record<EditMode, Component> = {
    CREATE: MysteryBoxCategorySpecCreateForm,
    UPDATE: MysteryBoxCategorySpecUpdateForm
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