package app.item.dao;

import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_LOWER_CASE)
public class Item {

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
	 *カテゴリコード
	 */
	private String categoryCode;

	/**
	 * 単価
	 */
	private String itemPrice;

	/**
	 *アルコール度数
	 */
	private String itemAlcoholPercentage;

	/**
	 * 在庫
	 */
	private String itemStock;

	/**
	 * 都道府県コード
	 */
	private String prefectureCode;

	/**
	 * 商品概要
	 */
	private String itemExplanation;

	/**
	 * イメージパス
	 */
	private String itemImage;

	/**
	 * @return itemCode
	 */
	public String getItemCode() {
		return itemCode;
	}

	/**
	 * @param itemCode セットする itemCode
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
	 * @param itemName セットする itemName
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
	 * @param itemKana セットする itemKana
	 */
	public void setItemKana(String itemKana) {
		this.itemKana = itemKana;
	}

	/**
	 * @return categoryCode
	 */
	public String getCategoryCode() {
		return categoryCode;
	}

	/**
	 * @param categoryCode セットする categoryCode
	 */
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	/**
	 * @return itemPrice
	 */
	public String getItemPrice() {
		return itemPrice;
	}

	/**
	 * @param itemPrice セットする itemPrice
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
	 * @param itemAlcoholPercentage セットする itemAlcoholPercentage
	 */
	public void setItemAlcoholPercentage(String itemAlcoholPercentage) {
		this.itemAlcoholPercentage = itemAlcoholPercentage;
	}

	/**
	 * @return itemStock
	 */
	public String getItemStock() {
		return itemStock;
	}

	/**
	 * @param itemStock セットする itemStock
	 */
	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}

	/**
	 * @return prefectureCode
	 */
	public String getPrefectureCode() {
		return prefectureCode;
	}

	/**
	 * @param prefectureCode セットする prefectureCode
	 */
	public void setPrefectureCode(String prefectureCode) {
		this.prefectureCode = prefectureCode;
	}

	/**
	 * @return itemExplanation
	 */
	public String getItemExplanation() {
		return itemExplanation;
	}

	/**
	 * @param itemExplanation セットする itemExplanation
	 */
	public void setItemExplanation(String itemExplanation) {
		this.itemExplanation = itemExplanation;
	}

	/**
	 * @return itemImage
	 */
	public String getItemImage() {
		return itemImage;
	}

	/**
	 * @param itemImage セットする itemImage
	 */
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

}
