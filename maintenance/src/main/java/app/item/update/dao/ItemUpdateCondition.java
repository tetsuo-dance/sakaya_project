package app.item.update.dao;

import app.dao.BaseCondition;

public class ItemUpdateCondition extends BaseCondition {

	/**
	 * 商品コード
	 */
	private String itemCode;

	/**
	 * 商品名
	 */
	private String itemName;

	/**
	 * 商品名（カナ）
	 */
	private String itemKana;
	/**
	 * 商品価格
	 */

	private String itemPrice;
	/**
	 * アルコール度数
	 */

	private String itemAlcoholPercentage;

	/**
	 * @return itemCode
	 */
	public String getItemCode() {
		return itemCode;
	}

	/**
	 * @param itemCode
	 *            セットする itemCode
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	/**
	 * @return itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName
	 *            セットする itemName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return itemKana
	 */
	public String getItemKana() {
		return itemKana;
	}

	/**
	 * @param itemKana
	 *            セットする itemKana
	 */
	public void setItemKana(String itemKana) {
		this.itemKana = itemKana;
	}

	/**
	 * @return itemPrice
	 */
	public String getItemPrice() {
		return itemPrice;
	}

	/**
	 * @param itemPrice
	 *            セットする itemPrice
	 */
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 * @return itemAlcoholPercentage
	 */
	public String getItemAlcoholPercentage() {
		return itemAlcoholPercentage;
	}

	/**
	 * @param itemAlcoholPercentage
	 *            セットする itemAlcoholPercentage
	 */
	public void setItemAlcoholPercentage(String itemAlcoholPercentage) {
		this.itemAlcoholPercentage = itemAlcoholPercentage;
	}

}
