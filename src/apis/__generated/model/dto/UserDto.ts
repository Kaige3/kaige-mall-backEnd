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
        status: string;
        rolesView: Array<{
            id: string;
            name: string;
        }>;
    }
}
