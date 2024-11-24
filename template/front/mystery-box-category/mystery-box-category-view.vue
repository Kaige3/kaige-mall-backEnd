<script lang="ts" setup>
    import MysteryBoxCategoryTable from './components/mystery-box-category-table.vue'
    import MysteryBoxCategoryQuery from './components/mystery-box-category-query.vue'
    import MysteryBoxCategoryDialog from './components/mystery-box-category-dialog.vue'
</script>
<template>
    <div class="mystery-box-category-view">
        <mystery-box-category-query></mystery-box-category-query>
        <mystery-box-category-dialog></mystery-box-category-dialog>
        <mystery-box-category-table></mystery-box-category-table>
    </div>
</template>

<style lang="scss" scoped>
.mystery-box-category-view {
    background: white;
    padding: 20px;
    border-radius: 5px;
}
</style>
