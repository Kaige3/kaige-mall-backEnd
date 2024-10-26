<script lang="ts" setup>
    import DictInputTable from './components/dict-input-table.vue'
    import DictInputQuery from './components/dict-input-query.vue'
    import DictInputDialog from './components/dict-input-dialog.vue'
</script>
<template>
    <div class="dict-input-view">
        <dict-input-query></dict-input-query>
        <dict-input-dialog></dict-input-dialog>
        <dict-input-table></dict-input-table>
    </div>
</template>

<style lang="scss" scoped>
.dict-input-view {
    background: white;
    padding: 20px;
    border-radius: 5px;
}
</style>
