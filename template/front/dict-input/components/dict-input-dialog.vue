<script lang="ts" setup>
  import { type Component } from 'vue'
  import { storeToRefs } from 'pinia'
  import { useDictInputStore } from '../store/dict-input-store'
  import DictInputCreateForm from './dict-input-create-form.vue'
  import DictInputUpdateForm from './dict-input-update-form.vue'
  import type { EditMode } from '@/typings'
  const dictInputStore = useDictInputStore()
  const { dialogData } = storeToRefs(dictInputStore)

  const formMap: Record<EditMode, Component> = {
    CREATE: DictInputCreateForm,
    UPDATE: DictInputUpdateForm
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