<script lang="ts" setup>
    import MenuSpecTable from './components/menu-spec-table.vue'
    import MenuSpecQuery from './components/menu-spec-query.vue'
    import MenuSpecDialog from './components/menu-spec-dialog.vue'
</script>
<template>
    <div class="menu-spec-view">
        <menu-spec-query></menu-spec-query>
        <menu-spec-dialog></menu-spec-dialog>
        <menu-spec-table></menu-spec-table>
    </div>
</template>

<style lang="scss" scoped>
.menu-spec-view {
    background: white;
    padding: 20px;
    border-radius: 5px;
}
</style>
