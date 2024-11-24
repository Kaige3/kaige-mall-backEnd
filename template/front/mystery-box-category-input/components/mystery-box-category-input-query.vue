<script lang="ts" setup>
  import { toRefs } from 'vue'
  import { useMysteryBoxCategoryInputStore } from '../store/mystery-box-category-input-store'
  import { storeToRefs } from 'pinia'
  import DictSelect from '@/components/dict/dict-select.vue'
  import DatetimePicker from '@/components/datetime/datetime-picker.vue'
  import { DictConstants } from '@/apis/__generated/model/enums/DictConstants'

  const mysteryBoxCategoryInputStore = useMysteryBoxCategoryInputStore()
  const { queryData } = storeToRefs(mysteryBoxCategoryInputStore)
  const { query } = toRefs(queryData.value)
</script>
<template>
  <div class="search">
    <el-form inline label-width="80" size="small">
    <el-form-item label="类别名称">
                <el-input v-model="query.getName"></el-input>
    </el-form-item>
    <el-form-item label="描述">
                <el-input v-model="query.getDescription"></el-input>
    </el-form-item>
    <el-form-item label="排序">
                <el-input-number v-model="query.getSortOrder" controls-position="right"></el-input-number>
    </el-form-item>
      <el-form-item label=" ">
        <div class="btn-wrapper">
          <el-button
                  type="primary"
                  size="small"
                  @click="mysteryBoxCategoryInputStore.reloadTableData({ query: query, likeMode: 'ANYWHERE' })"
          >
            查询
          </el-button>
          <el-button type="warning" size="small" @click="mysteryBoxCategoryInputStore.restQuery()"> 重置</el-button>
        </div>
      </el-form-item>
    </el-form>
  </div>
</template>

<style lang="scss" scoped>
  :deep(.el-form-item) {
    margin-bottom: 5px;
  }

  .search {
    display: flex;
    flex-flow: column nowrap;
    width: 100%;

    .btn-wrapper {
      margin-left: 20px;
    }
  }
</style>

