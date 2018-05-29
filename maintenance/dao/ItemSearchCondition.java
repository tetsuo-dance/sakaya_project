package app.item.search.dao;

import app.dao.BaseCondition;

public class ItemSearchCondition extends BaseCondition {

	/**
	 * 商品名
	 */
	private String itemName;

	/**
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName セットする itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
