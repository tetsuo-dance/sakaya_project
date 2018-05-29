package app.item.update.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import app.dao.DomaRepository;
import app.item.dao.Item;

@Dao
@DomaRepository
public interface ItemUpdateDao {

	@Select
	Item selectItem(ItemUpdateCondition condition);

	@Update(sqlFile = true)
	int updateItem(ItemUpdateCondition condition);
}
