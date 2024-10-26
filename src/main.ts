// 导入 Vue 框架的 createApp 函数用于创建应用实例
import { createApp } from 'vue'

// 导入 Pinia 作为状态管理工具
import { createPinia } from 'pinia'

// 导入 Element Plus 组件库及其样式
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

// 导入 Element Plus 的所有图标组件
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

// 导入根组件 App.vue
import App from './App.vue'

// 导入 Vue Router 配置
import router from './router'

// 创建 Vue 应用实例
const app = createApp(App)

// 注册 Pinia 作为状态管理插件
app.use(createPinia())

// 注册 Element Plus 组件库
app.use(ElementPlus)

// 注册 Vue Router 路由插件
app.use(router)

// 遍历并注册所有 Element Plus 图标组件
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
  app.component(key, component)
}

// 将应用挂载到 HTML 中 id 为 #app 的元素上
app.mount('#app')
