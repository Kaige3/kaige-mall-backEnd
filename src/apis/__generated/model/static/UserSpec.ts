import type {SEX} from '../enums/';

/**
 * Entity for table "user"
 */
export interface UserSpec {
    gender?: SEX | undefined;
    /**
     * 用户状态
     */
    status?: string | undefined;
    password?: string | undefined;
    id?: string | undefined;
    nickname?: string | undefined;
    avatar?: string | undefined;
    phone?: string | undefined;
    minCreatedTime?: string | undefined;
    maxCreatedTime?: string | undefined;
    minEditedTime?: string | undefined;
    maxEditedTime?: string | undefined;
}
