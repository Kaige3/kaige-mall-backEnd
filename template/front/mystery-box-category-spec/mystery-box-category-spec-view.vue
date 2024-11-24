<script lang="ts" setup>
    import MysteryBoxCategorySpecTable from './components/mystery-box-category-spec-table.vue'
    import MysteryBoxCategorySpecQuery from './components/mystery-box-category-spec-query.vue'
    import MysteryBoxCategorySpecDialog from './components/mystery-box-category-spec-dialog.vue'
</script>
<template>
    <div class="mystery-box-category-spec-view">
        <mystery-box-category-spec-query></mystery-box-category-spec-query>
        <mystery-box-category-spec-dialog></mystery-box-category-spec-dialog>
        <mystery-box-category-spec-table></mystery-box-category-spec-table>
    </div>
</template>

<style lang="scss" scoped>
.mystery-box-category-spec-view {
    background: white;
    padding: 20px;
    border-radius: 5px;
}
</style>
