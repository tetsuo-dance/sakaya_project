package app.item;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import app.common.CommonProcess;
import app.item.dao.Item;
import app.item.search.dao.ItemSearchCondition;
import app.item.search.dao.ItemSearchDao;
import app.item.search.dto.ItemSeaerchDto;

@Component
public class ItemSearchProcess extends CommonProcess {

	@Autowired
	private ItemSearchDao itemDao;

	public void search(Model model, ItemSeaerchDto itemSeaerchDto) {

		ItemSearchCondition itemSearchCondition = new ItemSearchCondition();

		// プロパティのコピー
		BeanUtils.copyProperties(itemSeaerchDto, itemSearchCondition);

		// 検索処理
		List<Item> list = this.itemDao.findAll(itemSearchCondition);
		model.addAttribute("list", list);

	}

}
