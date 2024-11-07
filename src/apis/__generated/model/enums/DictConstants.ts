
export const DictConstants = {
    COUPON_TYPE: 1006,
    PAY_TYPE: 1004,
    MENU_TYPE: 1002,
    REFUND_STATUS: 1010,
    PRODUCT_ORDER_STATUS: 1003,
    GENDER: 1001,
    COUPON_SCOPE_TYPE: 1007,
    COUPON_USE_STATUS: 1008,
    COUPON_RECEIVE_TYPE: 1009,
    NAVIGATOR_TYPE: 1013,
    QUALITY_TYPE: 1014,
    ORDER_TYPE: 1012,
    USER_STATUS: 1005,
}
export const Dictionaries = {
    CouponType: {
        DISCOUNT: {
          keyId: 0,
          keyName: '折扣券',
          keyEnName: 'DISCOUNT',
          dictId: 1006,
          dictName: '优惠券类型',
          dictEnName: 'COUPON_TYPE',
          orderNum: 0
        },
        REDUCE: {
          keyId: 1,
          keyName: '满减券',
          keyEnName: 'REDUCE',
          dictId: 1006,
          dictName: '优惠券类型',
          dictEnName: 'COUPON_TYPE',
          orderNum: 0
        },
      },
    PayType: {
        WE_CHAT_PAY: {
          keyId: 0,
          keyName: '微信支付',
          keyEnName: 'WE_CHAT_PAY',
          dictId: 1004,
          dictName: '支付类型',
          dictEnName: 'PAY_TYPE',
          orderNum: 0
        },
      },
    MenuType: {
        BUTTON: {
          keyId: 2,
          keyName: '按钮',
          keyEnName: 'BUTTON',
          dictId: 1002,
          dictName: '菜单类型',
          dictEnName: 'MENU_TYPE',
          orderNum: 2
        },
        PAGE: {
          keyId: 0,
          keyName: '页面',
          keyEnName: 'PAGE',
          dictId: 1002,
          dictName: '菜单类型',
          dictEnName: 'MENU_TYPE',
          orderNum: 1
        },
        DIRECTORY: {
          keyId: 1,
          keyName: '目录',
          keyEnName: 'DIRECTORY',
          dictId: 1002,
          dictName: '菜单类型',
          dictEnName: 'MENU_TYPE',
          orderNum: 0
        },
      },
    RefundStatus: {
        REFUNDING: {
          keyId: 0,
          keyName: '退款中',
          keyEnName: 'REFUNDING',
          dictId: 1010,
          dictName: '退款状态',
          dictEnName: 'REFUND_STATUS',
          orderNum: 0
        },
        SUCCESS: {
          keyId: 1,
          keyName: '退款成功',
          keyEnName: 'SUCCESS',
          dictId: 1010,
          dictName: '退款状态',
          dictEnName: 'REFUND_STATUS',
          orderNum: 0
        },
        FAILED: {
          keyId: 2,
          keyName: '退款失败',
          keyEnName: 'FAILED',
          dictId: 1010,
          dictName: '退款状态',
          dictEnName: 'REFUND_STATUS',
          orderNum: 0
        },
      },
    ProductOrderStatus: {
        CLOSED: {
          keyId: 4,
          keyName: '已关闭',
          keyEnName: 'CLOSED',
          dictId: 1003,
          dictName: '商品订单状态',
          dictEnName: 'PRODUCT_ORDER_STATUS',
          orderNum: 0
        },
        REFUNDED: {
          keyId: 5,
          keyName: '已退款',
          keyEnName: 'REFUNDED',
          dictId: 1003,
          dictName: '商品订单状态',
          dictEnName: 'PRODUCT_ORDER_STATUS',
          orderNum: 0
        },
        TO_BE_RECEIVED: {
          keyId: 2,
          keyName: '待收货',
          keyEnName: 'TO_BE_RECEIVED',
          dictId: 1003,
          dictName: '商品订单状态',
          dictEnName: 'PRODUCT_ORDER_STATUS',
          orderNum: 0
        },
        TO_BE_PAID: {
          keyId: 0,
          keyName: '待付款',
          keyEnName: 'TO_BE_PAID',
          dictId: 1003,
          dictName: '商品订单状态',
          dictEnName: 'PRODUCT_ORDER_STATUS',
          orderNum: 0
        },
        TO_BE_EVALUATED: {
          keyId: 3,
          keyName: '待评价',
          keyEnName: 'TO_BE_EVALUATED',
          dictId: 1003,
          dictName: '商品订单状态',
          dictEnName: 'PRODUCT_ORDER_STATUS',
          orderNum: 0
        },
        FINISHED: {
          keyId: 6,
          keyName: '已完成',
          keyEnName: 'FINISHED',
          dictId: 1003,
          dictName: '商品订单状态',
          dictEnName: 'PRODUCT_ORDER_STATUS',
          orderNum: 0
        },
        TO_BE_DELIVERED: {
          keyId: 1,
          keyName: '待发货',
          keyEnName: 'TO_BE_DELIVERED',
          dictId: 1003,
          dictName: '商品订单状态	',
          dictEnName: 'PRODUCT_ORDER_STATUS',
          orderNum: 0
        },
      },
    Gender: {
        PRIVATE: {
          keyId: 2,
          keyName: '保密',
          keyEnName: 'PRIVATE',
          dictId: 1001,
          dictName: '性别',
          dictEnName: 'GENDER',
          orderNum: 0
        },
        MALE: {
          keyId: 0,
          keyName: '男',
          keyEnName: 'MALE',
          dictId: 1001,
          dictName: '性别',
          dictEnName: 'GENDER',
          orderNum: 0
        },
        FEMALE: {
          keyId: 1,
          keyName: '女',
          keyEnName: 'FEMALE',
          dictId: 1001,
          dictName: '性别',
          dictEnName: 'GENDER',
          orderNum: 1
        },
      },
    CouponScopeType: {
        CATEGORY: {
          keyId: 2,
          keyName: '品类券',
          keyEnName: 'CATEGORY',
          dictId: 1007,
          dictName: '优惠券使用范围',
          dictEnName: 'COUPON_SCOPE_TYPE',
          orderNum: 0
        },
        PRODUCT: {
          keyId: 1,
          keyName: '商品券',
          keyEnName: 'PRODUCT',
          dictId: 1007,
          dictName: '优惠券使用范围',
          dictEnName: 'COUPON_SCOPE_TYPE',
          orderNum: 0
        },
        GENERAL: {
          keyId: 0,
          keyName: '通用券',
          keyEnName: 'GENERAL',
          dictId: 1007,
          dictName: '优惠券使用范围',
          dictEnName: 'COUPON_SCOPE_TYPE',
          orderNum: 0
        },
      },
    CouponUseStatus: {
        USED: {
          keyId: 1,
          keyName: '已使用',
          keyEnName: 'USED',
          dictId: 1008,
          dictName: '优惠券使用状态',
          dictEnName: 'COUPON_USE_STATUS',
          orderNum: 0
        },
        EXPIRED: {
          keyId: 2,
          keyName: '已过期',
          keyEnName: 'EXPIRED',
          dictId: 1008,
          dictName: '优惠券使用状态',
          dictEnName: 'COUPON_USE_STATUS',
          orderNum: 0
        },
        UNUSED: {
          keyId: 0,
          keyName: '未使用',
          keyEnName: 'UNUSED',
          dictId: 1008,
          dictName: '优惠券使用状态',
          dictEnName: 'COUPON_USE_STATUS',
          orderNum: 0
        },
      },
    CouponReceiveType: {
        GIFT: {
          keyId: 0,
          keyName: '系统赠送',
          keyEnName: 'GIFT',
          dictId: 1009,
          dictName: '优惠券获取方式',
          dictEnName: 'COUPON_RECEIVE_TYPE',
          orderNum: 0
        },
      },
    NavigatorType: {
        PRODUCT: {
          keyId: 0,
          keyName: '商品',
          keyEnName: 'PRODUCT',
          dictId: 1013,
          dictName: '跳转类型',
          dictEnName: 'NAVIGATOR_TYPE',
          orderNum: 0
        },
        BLIND_BOX: {
          keyId: 1,
          keyName: '盲盒',
          keyEnName: 'BLIND_BOX',
          dictId: 1013,
          dictName: '跳转类型',
          dictEnName: 'NAVIGATOR_TYPE',
          orderNum: 0
        },
      },
    QualityType: {
        GENERAL: {
          keyId: 0,
          keyName: '普通款',
          keyEnName: 'GENERAL',
          dictId: 1014,
          dictName: '商品品质',
          dictEnName: 'QUALITY_TYPE',
          orderNum: 0
        },
        HIDDEN: {
          keyId: 1,
          keyName: '隐藏款',
          keyEnName: 'HIDDEN',
          dictId: 1014,
          dictName: '商品品质',
          dictEnName: 'QUALITY_TYPE',
          orderNum: 0
        },
        LEGENDARY: {
          keyId: 2,
          keyName: '超神款',
          keyEnName: 'LEGENDARY',
          dictId: 1014,
          dictName: '商品品质',
          dictEnName: 'QUALITY_TYPE',
          orderNum: 0
        },
      },
    OrderType: {
        BLIND_BOX_ORDER: {
          keyId: 1,
          keyName: '盲盒订单',
          keyEnName: 'BLIND_BOX_ORDER',
          dictId: 1012,
          dictName: '订单类型',
          dictEnName: 'ORDER_TYPE',
          orderNum: 0
        },
        PRODUCT_ORDER: {
          keyId: 0,
          keyName: '商品订单',
          keyEnName: 'PRODUCT_ORDER',
          dictId: 1012,
          dictName: '订单类型',
          dictEnName: 'ORDER_TYPE',
          orderNum: 0
        },
        VIP_ORDER: {
          keyId: 2,
          keyName: 'VIP订单',
          keyEnName: 'VIP_ORDER',
          dictId: 1012,
          dictName: '订单类型',
          dictEnName: 'ORDER_TYPE',
          orderNum: 0
        },
      },
    UserStatus: {
        NORMAL: {
          keyId: 0,
          keyName: '正常',
          keyEnName: 'NORMAL',
          dictId: 1005,
          dictName: '用户状态',
          dictEnName: 'USER_STATUS',
          orderNum: 0
        },
        BANNED: {
          keyId: 1,
          keyName: '封禁',
          keyEnName: 'BANNED',
          dictId: 1005,
          dictName: '用户状态',
          dictEnName: 'USER_STATUS',
          orderNum: 0
        },
      },
}