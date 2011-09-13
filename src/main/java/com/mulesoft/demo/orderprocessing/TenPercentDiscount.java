package com.mulesoft.demo.orderprocessing;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/9/11
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class TenPercentDiscount {

	/**
	 * Calculate the discount.
	 *
	 * @param summary
	 * @return
	 */
	public OrderSummary calculateDiscount(OrderSummary summary) {

		summary.setDiscountPercentage((float)10);
		summary.calculateDiscountedPrice();

		return summary;
	}
}
