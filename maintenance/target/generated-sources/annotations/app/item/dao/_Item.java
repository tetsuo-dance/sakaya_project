package app.item.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.18.0" }, date = "2018-05-20T11:41:18.949+0900")
public final class _Item extends org.seasar.doma.jdbc.entity.AbstractEntityType<app.item.dao.Item> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.18.0");
    }

    private static final _Item __singleton = new _Item();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_LOWER_CASE;

    /** the itemCode */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, app.item.dao.Item, java.lang.String, Object> $itemCode = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(app.item.dao.Item.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "itemCode", "", __namingType, true, true, false);

    /** the itemName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, app.item.dao.Item, java.lang.String, Object> $itemName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(app.item.dao.Item.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "itemName", "", __namingType, true, true, false);

    /** the itemKana */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, app.item.dao.Item, java.lang.String, Object> $itemKana = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(app.item.dao.Item.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "itemKana", "", __namingType, true, true, false);

    /** the categoryCode */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, app.item.dao.Item, java.lang.String, Object> $categoryCode = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(app.item.dao.Item.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "categoryCode", "", __namingType, true, true, false);

    /** the itemPrice */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, app.item.dao.Item, java.lang.String, Object> $itemPrice = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(app.item.dao.Item.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "itemPrice", "", __namingType, true, true, false);

    /** the itemAlcoholPercentage */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, app.item.dao.Item, java.lang.String, Object> $itemAlcoholPercentage = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(app.item.dao.Item.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "itemAlcoholPercentage", "", __namingType, true, true, false);

    /** the itemStock */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, app.item.dao.Item, java.lang.String, Object> $itemStock = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(app.item.dao.Item.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "itemStock", "", __namingType, true, true, false);

    /** the prefectureCode */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, app.item.dao.Item, java.lang.String, Object> $prefectureCode = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(app.item.dao.Item.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "prefectureCode", "", __namingType, true, true, false);

    /** the itemExplanation */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, app.item.dao.Item, java.lang.String, Object> $itemExplanation = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(app.item.dao.Item.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "itemExplanation", "", __namingType, true, true, false);

    /** the itemImage */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, app.item.dao.Item, java.lang.String, Object> $itemImage = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(app.item.dao.Item.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "itemImage", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<app.item.dao.Item>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<app.item.dao.Item, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<app.item.dao.Item, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<app.item.dao.Item, ?>> __entityPropertyTypeMap;

    private _Item() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Item";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<app.item.dao.Item, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<app.item.dao.Item, ?>> __list = new java.util.ArrayList<>(10);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<app.item.dao.Item, ?>> __map = new java.util.HashMap<>(10);
        __list.add($itemCode);
        __map.put("itemCode", $itemCode);
        __list.add($itemName);
        __map.put("itemName", $itemName);
        __list.add($itemKana);
        __map.put("itemKana", $itemKana);
        __list.add($categoryCode);
        __map.put("categoryCode", $categoryCode);
        __list.add($itemPrice);
        __map.put("itemPrice", $itemPrice);
        __list.add($itemAlcoholPercentage);
        __map.put("itemAlcoholPercentage", $itemAlcoholPercentage);
        __list.add($itemStock);
        __map.put("itemStock", $itemStock);
        __list.add($prefectureCode);
        __map.put("prefectureCode", $prefectureCode);
        __list.add($itemExplanation);
        __map.put("itemExplanation", $itemExplanation);
        __list.add($itemImage);
        __map.put("itemImage", $itemImage);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(app.item.dao.Item entity, org.seasar.doma.jdbc.entity.PreInsertContext<app.item.dao.Item> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(app.item.dao.Item entity, org.seasar.doma.jdbc.entity.PreUpdateContext<app.item.dao.Item> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(app.item.dao.Item entity, org.seasar.doma.jdbc.entity.PreDeleteContext<app.item.dao.Item> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(app.item.dao.Item entity, org.seasar.doma.jdbc.entity.PostInsertContext<app.item.dao.Item> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(app.item.dao.Item entity, org.seasar.doma.jdbc.entity.PostUpdateContext<app.item.dao.Item> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(app.item.dao.Item entity, org.seasar.doma.jdbc.entity.PostDeleteContext<app.item.dao.Item> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<app.item.dao.Item, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<app.item.dao.Item, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<app.item.dao.Item, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, app.item.dao.Item, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, app.item.dao.Item, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, app.item.dao.Item, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public app.item.dao.Item newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<app.item.dao.Item, ?>> __args) {
        app.item.dao.Item entity = new app.item.dao.Item();
        if (__args.get("itemCode") != null) __args.get("itemCode").save(entity);
        if (__args.get("itemName") != null) __args.get("itemName").save(entity);
        if (__args.get("itemKana") != null) __args.get("itemKana").save(entity);
        if (__args.get("categoryCode") != null) __args.get("categoryCode").save(entity);
        if (__args.get("itemPrice") != null) __args.get("itemPrice").save(entity);
        if (__args.get("itemAlcoholPercentage") != null) __args.get("itemAlcoholPercentage").save(entity);
        if (__args.get("itemStock") != null) __args.get("itemStock").save(entity);
        if (__args.get("prefectureCode") != null) __args.get("prefectureCode").save(entity);
        if (__args.get("itemExplanation") != null) __args.get("itemExplanation").save(entity);
        if (__args.get("itemImage") != null) __args.get("itemImage").save(entity);
        return entity;
    }

    @Override
    public Class<app.item.dao.Item> getEntityClass() {
        return app.item.dao.Item.class;
    }

    @Override
    public app.item.dao.Item getOriginalStates(app.item.dao.Item __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(app.item.dao.Item __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Item getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Item newInstance() {
        return new _Item();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<app.item.dao.Item> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
