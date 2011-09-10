package com.mulesoft.demo.orderprocessing;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/9/11
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class OrderSummary {

	/** Unique order id */
	private String orderId;

	/** Count of the number of ordered items */
	private int itemCount;

	/** Total List price of all items */
	private float totalListPrice;

	/** Total Discounted price of items */
	private float totalDiscountedPrice;

	/** Discount for order size */
	private float discountPercentage;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public float getTotalListPrice() {
		return totalListPrice;
	}

	public void setTotalListPrice(float totalListPrice) {
		this.totalListPrice = totalListPrice;
	}

	public float getTotalDiscountedPrice() {
		return totalDiscountedPrice;
	}

	public void setTotalDiscountedPrice(float totalDiscountedPrice) {
		this.totalDiscountedPrice = totalDiscountedPrice;
	}

	public float getdiscountPercentage() {
		return discountPercentage;
	}

	public void setdiscountPercentage(float discount) {
		this.discountPercentage = discount;
	}

	public void calculateDiscountedPrice(){
		this.setTotalDiscountedPrice((float) ((100.00 - this.discountPercentage)/100.00) * this.totalListPrice);
	}
}
