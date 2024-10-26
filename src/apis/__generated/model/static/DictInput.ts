/**
 * Entity for table "dict"
 */
export interface DictInput {
    keyId?: number | undefined;
    keyEnName: string;
    keyName: string;
    dictId?: number | undefined;
    dictName: string;
    dictEnName: string;
    orderNum?: number | undefined;
    /**
     * 是否可见
     */
    visible: boolean;
    id?: string | undefined;
}
