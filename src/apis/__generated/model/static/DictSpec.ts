/**
 * Entity for table "dict"
 */
export interface DictSpec {
    keyId?: number | undefined;
    dictId?: number | undefined;
    orderNum?: number | undefined;
    /**
     * 是否可见
     */
    visible?: boolean | undefined;
    dictName?: string | undefined;
    keyName?: string | undefined;
    dictEnName?: string | undefined;
    keyEnName?: string | undefined;
    id?: string | undefined;
    minEditedTime?: string | undefined;
    maxEditedTime?: string | undefined;
    minCreatedTime?: string | undefined;
    maxCreatedTime?: string | undefined;
}
