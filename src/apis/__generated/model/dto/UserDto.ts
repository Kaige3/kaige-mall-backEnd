import type {SEX} from '../enums/';

export type UserDto = {
    'UserRepository/COMPLEX_FETCHER': {
        id: string;
        createdTime: string;
        editedTime: string;
        nickname?: string | undefined;
        avatar?: string | undefined;
        gender?: SEX | undefined;
        phone: string;
        password: string;
        /**
         * 用户状态
         */
        status: string;
    }, 
    'UserRepository/USER_ROLE_FETCHER': {
        id: string;
        createdTime: string;
        editedTime: string;
        nickname?: string | undefined;
        avatar?: string | undefined;
        gender?: SEX | undefined;
        phone: string;
        password: string;
        /**
         * 用户状态
         */
        status: string;
        rolesView: Array<{
            id: string;
            name: string;
        }>;
    }
}
