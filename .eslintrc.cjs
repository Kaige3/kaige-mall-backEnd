/* eslint-env node */
// 指定这是一个 Node.js 环境的配置文件。
require('@rushstack/eslint-patch/modern-module-resolution')

module.exports = {
  root: true,
  // 标记这是项目的根 ESLint 配置文件，防止 ESLint 继续向上查找其他配置。
  extends: [
    'plugin:vue/vue3-essential',
    // 包含 Vue 3 的基本 ESLint 规则。
    'eslint:recommended',
    // 启用 ESLint 推荐的核心规则。
    '@vue/eslint-config-typescript',
    // 集成 Vue 和 TypeScript 的 ESLint 配置。
    '@vue/eslint-config-prettier/skip-formatting'
    // 禁用与 Prettier 格式化规则冲突的 ESLint 规则，并且不会强制 Prettier 的格式。
  ],
  parserOptions: {
    ecmaVersion: 'latest'
  },
  rules: {
    'prettier/prettier': [
      'warn',
      // 如果 Prettier 的格式不符合，会给出警告而不是错误。
      {
        endOfLine: 'auto'
        // 解决不同操作系统之间换行符不一致的问题。
      }
    ]
  }
}
