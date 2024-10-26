import type {SEX} from '../enums/';

/**
 * Entity for table "user"
 */
export interface UserInput {
    nickname?: string | undefined;
    avatar?: string | undefined;
    gender?: SEX | undefined;
    phone: string;
    password: string;
    /**
     * 用户状态
     */
    status: string;
    id?: string | undefined;
    roleIds: Array<string>;
}
