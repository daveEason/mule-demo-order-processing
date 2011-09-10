package com.mulesoft.demo.orderprocessing;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 9/9/11
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class OrderPerson {

	/** First name */
	private String firstName;

	/** Last name */
	private String lastName;

	/** City */
	private String city;

	/** State */
	private String state;

    public OrderPerson(){
        // default no-argument constructor
    }

    public OrderPerson(String firstName, String lastName, String city, String state){

        setFirstName(firstName);
        setLastName(lastName);
        setCity(city);
        setState(state);
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
