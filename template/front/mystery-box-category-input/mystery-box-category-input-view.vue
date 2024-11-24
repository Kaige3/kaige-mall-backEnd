<script lang="ts" setup>
    import MysteryBoxCategoryInputTable from './components/mystery-box-category-input-table.vue'
    import MysteryBoxCategoryInputQuery from './components/mystery-box-category-input-query.vue'
    import MysteryBoxCategoryInputDialog from './components/mystery-box-category-input-dialog.vue'
</script>
<template>
    <div class="mystery-box-category-input-view">
        <mystery-box-category-input-query></mystery-box-category-input-query>
        <mystery-box-category-input-dialog></mystery-box-category-input-dialog>
        <mystery-box-category-input-table></mystery-box-category-input-table>
    </div>
</template>

<style lang="scss" scoped>
.mystery-box-category-input-view {
    background: white;
    padding: 20px;
    border-radius: 5px;
}
</style>
