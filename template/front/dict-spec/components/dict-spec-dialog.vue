<script lang="ts" setup>
  import { type Component } from 'vue'
  import { storeToRefs } from 'pinia'
  import { useDictSpecStore } from '../store/dict-spec-store'
  import DictSpecCreateForm from './dict-spec-create-form.vue'
  import DictSpecUpdateForm from './dict-spec-update-form.vue'
  import type { EditMode } from '@/typings'
  const dictSpecStore = useDictSpecStore()
  const { dialogData } = storeToRefs(dictSpecStore)

  const formMap: Record<EditMode, Component> = {
    CREATE: DictSpecCreateForm,
    UPDATE: DictSpecUpdateForm
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