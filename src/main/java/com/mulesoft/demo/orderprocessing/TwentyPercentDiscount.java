package com.mulesoft.demo.orderprocessing;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/9/11
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class TwentyPercentDiscount {

	/**
	 * Calculate the discount.
	 *
	 * @param summary
	 * @return
	 */
	public OrderSummary calculateDiscount(OrderSummary summary) {

		summary.setdiscountPercentage((float)20);
		summary.calculateDiscountedPrice();

		return summary;
	}
}
