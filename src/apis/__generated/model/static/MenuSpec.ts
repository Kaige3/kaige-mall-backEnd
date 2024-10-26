import type {MenuType} from '../enums/';

/**
 * Entity for table "menu"
 */
export interface MenuSpec {
    orderNum?: number | undefined;
    menuType?: MenuType | undefined;
    icon?: string | undefined;
    name?: string | undefined;
    path?: string | undefined;
    parentId?: string | undefined;
    id?: string | undefined;
    minEditedTime?: string | undefined;
    maxEditedTime?: string | undefined;
    minCreatedTime?: string | undefined;
    maxCreatedTime?: string | undefined;
}
