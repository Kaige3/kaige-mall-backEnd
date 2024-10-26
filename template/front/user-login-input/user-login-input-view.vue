<script lang="ts" setup>
    import UserLoginInputTable from './components/user-login-input-table.vue'
    import UserLoginInputQuery from './components/user-login-input-query.vue'
    import UserLoginInputDialog from './components/user-login-input-dialog.vue'
</script>
<template>
    <div class="user-login-input-view">
        <user-login-input-query></user-login-input-query>
        <user-login-input-dialog></user-login-input-dialog>
        <user-login-input-table></user-login-input-table>
    </div>
</template>

<style lang="scss" scoped>
.user-login-input-view {
    background: white;
    padding: 20px;
    border-radius: 5px;
}
</style>
