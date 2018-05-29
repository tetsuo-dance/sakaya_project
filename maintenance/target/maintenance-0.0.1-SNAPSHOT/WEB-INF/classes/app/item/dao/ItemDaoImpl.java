package app.item.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.18.0" }, date = "2018-05-16T23:48:53.829+0900")
public class ItemDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements app.item.dao.ItemDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.18.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(app.item.dao.ItemDao.class, "findAll");

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public ItemDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<app.item.dao.Item> findAll() {
        entering("app.item.dao.ItemDaoImpl", "findAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/app/item/dao/ItemDao/findAll.sql");
            __query.setEntityType(app.item.dao._Item.getSingletonInternal());
            __query.setCallerClassName("app.item.dao.ItemDaoImpl");
            __query.setCallerMethodName("findAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<app.item.dao.Item>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<app.item.dao.Item>(app.item.dao._Item.getSingletonInternal()));
            java.util.List<app.item.dao.Item> __result = __command.execute();
            __query.complete();
            exiting("app.item.dao.ItemDaoImpl", "findAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("app.item.dao.ItemDaoImpl", "findAll", __e);
            throw __e;
        }
    }

}
