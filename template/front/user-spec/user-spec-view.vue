<script lang="ts" setup>
    import UserSpecTable from './components/user-spec-table.vue'
    import UserSpecQuery from './components/user-spec-query.vue'
    import UserSpecDialog from './components/user-spec-dialog.vue'
</script>
<template>
    <div class="user-spec-view">
        <user-spec-query></user-spec-query>
        <user-spec-dialog></user-spec-dialog>
        <user-spec-table></user-spec-table>
    </div>
</template>

<style lang="scss" scoped>
.user-spec-view {
    background: white;
    padding: 20px;
    border-radius: 5px;
}
</style>
