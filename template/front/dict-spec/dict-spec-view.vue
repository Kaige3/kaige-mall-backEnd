<script lang="ts" setup>
    import DictSpecTable from './components/dict-spec-table.vue'
    import DictSpecQuery from './components/dict-spec-query.vue'
    import DictSpecDialog from './components/dict-spec-dialog.vue'
</script>
<template>
    <div class="dict-spec-view">
        <dict-spec-query></dict-spec-query>
        <dict-spec-dialog></dict-spec-dialog>
        <dict-spec-table></dict-spec-table>
    </div>
</template>

<style lang="scss" scoped>
.dict-spec-view {
    background: white;
    padding: 20px;
    border-radius: 5px;
}
</style>
