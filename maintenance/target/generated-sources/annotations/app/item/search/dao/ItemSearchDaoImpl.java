package app.item.search.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.18.0" }, date = "2018-05-20T11:41:19.429+0900")
public class ItemSearchDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements app.item.search.dao.ItemSearchDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.18.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(app.item.search.dao.ItemSearchDao.class, "findAll", app.item.search.dao.ItemSearchCondition.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public ItemSearchDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<app.item.dao.Item> findAll(app.item.search.dao.ItemSearchCondition condition) {
        entering("app.item.search.dao.ItemSearchDaoImpl", "findAll", condition);
        try {
            if (condition == null) {
                throw new org.seasar.doma.DomaNullPointerException("condition");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/app/item/search/dao/ItemSearchDao/findAll.sql");
            __query.setEntityType(app.item.dao._Item.getSingletonInternal());
            __query.addParameter("condition", app.item.search.dao.ItemSearchCondition.class, condition);
            __query.setCallerClassName("app.item.search.dao.ItemSearchDaoImpl");
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
            exiting("app.item.search.dao.ItemSearchDaoImpl", "findAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("app.item.search.dao.ItemSearchDaoImpl", "findAll", __e);
            throw __e;
        }
    }

}
