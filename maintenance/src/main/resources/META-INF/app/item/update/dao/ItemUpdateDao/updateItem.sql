update item
set 
     ITEM_NAME = /* condition.itemName */'商品名'
    ,ITEM_KANA = /* condition.itemKana */'商品名(カナ）'
    ,ITEM_PRICE = /* condition.itemPrice */'商品価格'
    ,ITEM_ALCOHOL_PERCENTAGE = /* condition.itemAlcoholPercentage */'アルコール度数'
    ,ITEM_IMAGE = /* condition.itemImage */'商品画像'
where
    ITEM_CODE = /* condition.itemCode */'商品コード'
