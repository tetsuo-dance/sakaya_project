package app.item.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;

import app.dao.DomaRepository;

@Dao
@DomaRepository
public interface ItemDao {

	@Insert
	int insert(Item item);
}
