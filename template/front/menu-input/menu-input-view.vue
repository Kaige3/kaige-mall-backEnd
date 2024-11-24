<script lang="ts" setup>
    import MenuInputTable from './components/menu-input-table.vue'
    import MenuInputQuery from './components/menu-input-query.vue'
    import MenuInputDialog from './components/menu-input-dialog.vue'
</script>
<template>
    <div class="menu-input-view">
        <menu-input-query></menu-input-query>
        <menu-input-dialog></menu-input-dialog>
        <menu-input-table></menu-input-table>
    </div>
</template>

<style lang="scss" scoped>
.menu-input-view {
    background: white;
    padding: 20px;
    border-radius: 5px;
}
</style>
