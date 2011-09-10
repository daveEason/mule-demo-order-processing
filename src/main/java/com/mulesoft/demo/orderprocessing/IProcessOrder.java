package com.mulesoft.demo.orderprocessing;


import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/9/11
 * Time: 4:05 PM
 * To change this template use File | Settings | File Templates.
 */

@WebService
public interface IProcessOrder {

	/**
	 * Process an order.
	 *
	 * @param order
	 * @return
	 */
	@WebResult(name = "summary")
	OrderSummary processOrder(@WebParam(name = "order") Order order);
}