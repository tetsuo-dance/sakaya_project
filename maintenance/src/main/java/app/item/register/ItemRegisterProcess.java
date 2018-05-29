package app.item.register;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.common.CommonProcess;
import app.item.dao.Item;
import app.item.dao.ItemDao;
import app.item.dto.ItemDto;

@Service
public class ItemRegisterProcess extends CommonProcess {

	@Autowired
	private ItemDao itemDao;

	/**
	 * 登録処理を行います。
	 * @param itemDto form
	 */
	public void register(ItemDto itemDto) {

		Item item = new Item();
		BeanUtils.copyProperties(itemDto, item);

		// 登録処理
		itemDao.insert(item);

	}

}
