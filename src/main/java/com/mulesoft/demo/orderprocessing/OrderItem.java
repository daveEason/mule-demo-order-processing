package com.mulesoft.demo.orderprocessing;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/9/11
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class OrderItem {

	/** Item number */
	private String productId;

	/** Item name */
	private String name;

	/** Item listPrice */
	private float listPrice;

	/** Item quantity */
	private int quantity;

    public OrderItem(){
        // default no-argument constructor
    }

    public OrderItem(String productId, String name, float listPrice, int quantity){

        setProductId(productId);
        setName(name);
        setListPrice(listPrice);
        setQuantity(quantity);
    }

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getListPrice() {
		return listPrice;
	}

	public void setListPrice(float listPrice) {
		this.listPrice = listPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
