package com.mulesoft.demo.orderprocessing;

import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/9/11
 * Time: 4:15 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.mulesoft.demo.orderprocessing.IProcessOrder", serviceName = "ProcessOrder")
public class ProcessOrderImpl implements IProcessOrder {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.com.mulesoft.demo.com.mulesoft.demo.orderprocessing.IProcessOrder#processOrder(org.com.mulesoft.demo.com.mulesoft.demo.orderprocessing.Order)
	 */
	public OrderSummary processOrder(Order order) {
		int itemCount = 0;
		float totalListPrice = 0.0f;
		for (OrderItem item : order.getItems()) {
			for (int x = 0; x < item.getQuantity(); x++) {
				itemCount++;
				totalListPrice += item.getListPrice();
			}
		}

		OrderSummary summary = new OrderSummary();
		summary.setOrderId(order.getOrderId());
		summary.setItemCount(itemCount);
		summary.setTotalListPrice(totalListPrice);
		return summary;
	}
}
