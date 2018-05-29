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
/*%if @isNotEmpty(condition.itemName) */
    ITEM_NAME like /* contain(condition.itemName) */'%商品名%' ESCAPE '$'
/*%end */
