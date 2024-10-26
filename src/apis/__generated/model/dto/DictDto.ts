export type DictDto = {
    'DictRepository/COMPLEX_FETCHER': {
        id: string;
        createdTime: string;
        editedTime: string;
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
    }
}
