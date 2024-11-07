import type {SEX} from '../enums/';

export interface UserSpec {
    gender?: SEX | undefined;
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
