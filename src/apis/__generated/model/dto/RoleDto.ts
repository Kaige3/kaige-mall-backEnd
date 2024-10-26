export type RoleDto = {
    'RoleRepository/COMPLEX_FETCHER': {
        id: string;
        createdTime: string;
        editedTime: string;
        name: string;
    }, 
    'RoleRepository/ROLE_MENU_FETCHER': {
        id: string;
        createdTime: string;
        editedTime: string;
        name: string;
        menusView: Array<{
            id: string;
        }>;
    }
}
