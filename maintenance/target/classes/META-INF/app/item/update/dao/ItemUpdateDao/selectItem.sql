select
    ITEM_CODE
    ,ITEM_NAME
    ,ITEM_KANA
    ,CATEGORY_CODE
    ,ITEM_PRICE
    ,ITEM_ALCOHOL_PERCENTAGE
    ,ITEM_STOCK
    ,PREFECTURE_CODE
    ,ITEM_EXPLANATION
    ,ITEM_IMAGE
from
    item
where
    ITEM_CODE = /* condition.itemCode */'商品コード'
