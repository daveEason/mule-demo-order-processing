package com.mulesoft.demo.orderprocessing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/9/11
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {

    public Order (){
        // default no-argument constructor
    }

    public Order(String orderId, OrderPerson customer, List<OrderItem> items){
        setOrderId(orderId);
        setCustomer(customer);
        setItems(items);
    }

	@XmlElement(name = "orderId")
	private String orderId;

	/** Customer associated with order */
	@XmlElement(name = "customer")
	private OrderPerson customer;

	/** List of items on an order */
	@XmlElement(name = "item")
	private List<OrderItem> items;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public OrderPerson getCustomer() {
		return customer;
	}

	public void setCustomer(OrderPerson customer) {
		this.customer = customer;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
}
