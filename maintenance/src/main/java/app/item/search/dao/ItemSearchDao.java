package app.item.search.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import app.dao.DomaRepository;
import app.item.dao.Item;

@Dao
@DomaRepository
public interface ItemSearchDao {

	@Select
	List<Item> findAll(ItemSearchCondition condition);
}
