package app.item.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.18.0" }, date = "2018-05-20T11:41:19.473+0900")
public class ItemDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements app.item.dao.ItemDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.18.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(app.item.dao.ItemDao.class, "insert", app.item.dao.Item.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public ItemDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int insert(app.item.dao.Item item) {
        entering("app.item.dao.ItemDaoImpl", "insert", item);
        try {
            if (item == null) {
                throw new org.seasar.doma.DomaNullPointerException("item");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<app.item.dao.Item> __query = getQueryImplementors().createAutoInsertQuery(__method0, app.item.dao._Item.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setEntity(item);
            __query.setCallerClassName("app.item.dao.ItemDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method0, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("app.item.dao.ItemDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("app.item.dao.ItemDaoImpl", "insert", __e);
            throw __e;
        }
    }

}
