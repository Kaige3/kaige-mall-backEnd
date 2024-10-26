import type {MenuType} from '../enums/';

/**
 * Entity for table "menu"
 */
export interface MenuInput {
    name: string;
    path: string;
    parentId?: string | undefined;
    orderNum?: number | undefined;
    menuType: MenuType;
    icon?: string | undefined;
    id?: string | undefined;
}
