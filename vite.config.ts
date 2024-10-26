// 从 'node:url' 中导入 fileURLToPath 和 URL，方便处理文件路径
import { fileURLToPath, URL } from 'node:url'

// 从 'vite' 中导入 defineConfig，用于定义 Vite 配置
import { defineConfig } from 'vite'
// 导入 Vite 的 Vue 插件，支持 Vue 单文件组件（SFC）
import vue from '@vitejs/plugin-vue'
// 导入 Vite 的 JSX 插件，使 Vue 支持 JSX 语法
import vueJsx from '@vitejs/plugin-vue-jsx'

// 导出 Vite 配置对象
export default defineConfig({
  // 配置 Vite 插件
  plugins: [
    vue(), // 启用 Vue 插件
    vueJsx() // 启用 Vue JSX 插件
  ],
  // 配置模块解析相关选项
  resolve: {
    alias: {
      // 设置路径别名，将 '@' 解析为 src 目录
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  },
  // 配置开发服务器选项
  server: {
    host: '0.0.0.0', // 允许局域网和外部设备访问
    port: 5178, // 开发服务器运行的端口
    proxy: {
      // 设置代理，将以 /api 开头的请求转发到后端服务器
      '/api': {
        target: 'http://localhost:8082', // 后端服务器地址
        changeOrigin: true, // 允许跨域请求
        // 重写请求路径，将 /api 去除，避免后端路径错误
        rewrite: (path) => path.replace(/^\/api/, '')
      }
    }
  },
  define: {
    '__VUE_PROD_HYDRATION_MISMATCH_DETAILS__': 'true'
  }
})
