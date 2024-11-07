import { createRouter, createWebHashHistory, createWebHistory } from 'vue-router'

// import { useHomeStore } from '@/stores/home-store'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    
    {
      path: '/',
      name: 'layout-view',
      component: () => import('@/layout/layout-view.vue'),
      children: [{
        path:'/menu',
        name:"menu-view",
        component:()=>import('@/views/menu/menu-view.vue')
      },
      {
        path:'/role',
        name:"role-view",
        component:()=>import('@/views/role/role-view.vue')
      },
      {
        path:'/user',
        name:"user-view",
        component:()=>import('@/views/user/user-view.vue')
      },
      {
        path: '/dict',
        name: 'dict-view',
        component: () => import('@/views/dict/dict-view.vue')
      }
    ]
    },
    
    {
      path: '/login',
      name: 'login',
      component: () => import('@/views/login/login-view.vue')
    }
  ]
})
// 添加路由拦截，在进入路由之前需要校验是否有该菜单的权限
// eslint-disable-next-line no-sparse-arrays
// const whiteList = ['/login', '/register', '/rest-password', '/']
// router.beforeEach(async (to, from, next) => {
//   const homeStore = useHomeStore()
//   if (
//     whiteList.includes(to.path) ||
//     (await homeStore.getMenuList()).findIndex((menu) => menu.path === to.path) >= 0
//   ) {
//     next()
//   } else {
//     return next('/')
//   }
// })
export default router
