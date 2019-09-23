package project;

import java.util.ArrayList;

public class Customer {
	String name, address;
	
	public Customer(String name, String address) {
		setName(name);
		setAddress(address);
		ArrayList<Object> Orders = new ArrayList<Object>();
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setAddress(String a) {
		this.address = a;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
}
