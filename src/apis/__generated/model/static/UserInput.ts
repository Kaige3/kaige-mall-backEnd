import type {SEX} from '../enums/';

export interface UserInput {
    nickname?: string | undefined;
    avatar?: string | undefined;
    gender?: SEX | undefined;
    phone: string;
    password: string;
    status: string;
    id?: string | undefined;
    roleIds: Array<string>;
}
