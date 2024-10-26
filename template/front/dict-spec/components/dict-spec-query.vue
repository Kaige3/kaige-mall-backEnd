<script lang="ts" setup>
  import { toRefs } from 'vue'
  import { useDictSpecStore } from '../store/dict-spec-store'
  import { storeToRefs } from 'pinia'
  import DictSelect from '@/components/dict/dict-select.vue'
  import DatetimePicker from '@/components/datetime/datetime-picker.vue'
  import { DictConstants } from '@/apis/__generated/model/enums/DictConstants'

  const dictSpecStore = useDictSpecStore()
  const { queryData } = storeToRefs(dictSpecStore)
  const { query } = toRefs(queryData.value)
</script>
<template>
  <div class="search">
    <el-form inline label-width="80" size="small">
    <el-form-item label="值编号">
                <el-input-number v-model="query.getKeyId" controls-position="right"></el-input-number>
    </el-form-item>
    <el-form-item label="值名称">
                <el-input v-model="query.getKeyName"></el-input>
    </el-form-item>
    <el-form-item label="值英文名称">
                <el-input v-model="query.getKeyEnName"></el-input>
    </el-form-item>
    <el-form-item label="字典编号">
                <el-input-number v-model="query.getDictId" controls-position="right"></el-input-number>
    </el-form-item>
    <el-form-item label="字典名称">
                <el-input v-model="query.getDictName"></el-input>
    </el-form-item>
    <el-form-item label="字段英文名称">
                <el-input v-model="query.getDictEnName"></el-input>
    </el-form-item>
    <el-form-item label="排序号">
                <el-input-number v-model="query.getOrderNum" controls-position="right"></el-input-number>
    </el-form-item>
    <el-form-item label="是否可见">
                <el-input-number v-model="query.getVisible" controls-position="right"></el-input-number>
    </el-form-item>
      <el-form-item label=" ">
        <div class="btn-wrapper">
          <el-button
                  type="primary"
                  size="small"
                  @click="dictSpecStore.reloadTableData({ query: query, likeMode: 'ANYWHERE' })"
          >
            查询
          </el-button>
          <el-button type="warning" size="small" @click="dictSpecStore.restQuery()"> 重置</el-button>
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

