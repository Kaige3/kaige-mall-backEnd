<script lang="ts" setup>
    import RoleSpecTable from './components/role-spec-table.vue'
    import RoleSpecQuery from './components/role-spec-query.vue'
    import RoleSpecDialog from './components/role-spec-dialog.vue'
</script>
<template>
    <div class="role-spec-view">
        <role-spec-query></role-spec-query>
        <role-spec-dialog></role-spec-dialog>
        <role-spec-table></role-spec-table>
    </div>
</template>

<style lang="scss" scoped>
.role-spec-view {
    background: white;
    padding: 20px;
    border-radius: 5px;
}
</style>
