// 导入 MenuDto 类型，用于定义菜单相关的数据结构
import type { MenuDto } from '@/apis/__generated/model/dto'

// 定义编辑模式的类型，可以是 'CREATE' 或 'UPDATE'
export type EditMode = 'CREATE' | 'UPDATE'

// 定义一个泛型接口 Scope，用于表示行数据和索引
export interface Scope<T> {
  row: T // 当前行的数据，类型为 T
  $index: number // 当前行的索引
}

// 定义一个泛型接口 Result，用于表示 API 请求的结果
export interface Result<T> {
  code: number // 响应状态码
  success: boolean // 请求是否成功
  msg: string // 描述信息，通常用于提供错误或成功的信息
  result: T // 包含具体的数据，类型为 T
}

// 定义菜单树的类型 MenuTreeDto，表示菜单及其子菜单
export type MenuTreeDto = {
  children?: MenuTreeDto[] // 可选的子菜单，类型为 MenuTreeDto 的数组
} & MenuDto['MenuRepository/SIMPLE_FETCHER'] // 结合 MenuDto 的简单菜单属性
