import type {MenuType} from '../enums/';

export type MenuDto = {
    'MenuRepository/COMPLEX_FETCHER': {
        id: string;
        createdTime: string;
        editedTime: string;
        name: string;
        path: string;
        parentId?: string | undefined;
        orderNum?: number | undefined;
        menuType: MenuType;
        icon?: string | undefined;
        creator: {
            id: string;
            phone: string;
            nickname?: string | undefined;
        };
        editor: {
            id: string;
            phone: string;
            nickname?: string | undefined;
        };
    }
}