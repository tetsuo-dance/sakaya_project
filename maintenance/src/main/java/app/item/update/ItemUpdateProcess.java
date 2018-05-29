package app.item.update;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import app.common.CommonProcess;
import app.item.dao.Item;
import app.item.update.dao.ItemUpdateCondition;
import app.item.update.dao.ItemUpdateDao;
import app.item.update.dto.ItemUpdateDto;

@Service
public class ItemUpdateProcess extends CommonProcess {

	@Autowired
	private ItemUpdateDao itemUpdateDao;

	/**
	 * 商品コードを元に検索処理を行います。
	 */
	public void selectItem(Model model, ItemUpdateDto itemUpdateDto) {

		ItemUpdateCondition itemUpdateCondition = new ItemUpdateCondition();

		// プロパティのコピー
		BeanUtils.copyProperties(itemUpdateDto, itemUpdateCondition);

		// 検索処理
		Item item = this.itemUpdateDao.selectItem(itemUpdateCondition);
		model.addAttribute("itemUpdateDto", item);

	}

	/**
	 * 更新処理を行います。
	 * 
	 * @param itemDto
	 *            form
	 */
	public void updateItem(Model model, ItemUpdateDto itemUpdateDto) {

		ItemUpdateCondition itemUpdateCondition = new ItemUpdateCondition();

		// プロパティのコピー
		BeanUtils.copyProperties(itemUpdateDto, itemUpdateCondition);

		// 検索処理
		int updateStatus = this.itemUpdateDao.updateItem(itemUpdateCondition);

		if (updateStatus == 1) {
			// 例外処理ってどうする？
		}
		model.addAttribute("updateStatus", updateStatus);

	}

}
