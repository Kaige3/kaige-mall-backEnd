<script lang="ts" setup>
    import RoleInputTable from './components/role-input-table.vue'
    import RoleInputQuery from './components/role-input-query.vue'
    import RoleInputDialog from './components/role-input-dialog.vue'
</script>
<template>
    <div class="role-input-view">
        <role-input-query></role-input-query>
        <role-input-dialog></role-input-dialog>
        <role-input-table></role-input-table>
    </div>
</template>

<style lang="scss" scoped>
.role-input-view {
    background: white;
    padding: 20px;
    border-radius: 5px;
}
</style>
