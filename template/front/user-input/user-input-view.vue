<script lang="ts" setup>
    import UserInputTable from './components/user-input-table.vue'
    import UserInputQuery from './components/user-input-query.vue'
    import UserInputDialog from './components/user-input-dialog.vue'
</script>
<template>
    <div class="user-input-view">
        <user-input-query></user-input-query>
        <user-input-dialog></user-input-dialog>
        <user-input-table></user-input-table>
    </div>
</template>

<style lang="scss" scoped>
.user-input-view {
    background: white;
    padding: 20px;
    border-radius: 5px;
}
</style>
