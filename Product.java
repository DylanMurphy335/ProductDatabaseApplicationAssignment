package project;

public class Product {
	private String name, description;
	private int price, productID;
	
	public Product(String name, String description, int price, int productID) {
		setName(name);
		setDescription(description);
		setPrice(price);
		setProductID(productID);
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setDescription(String d) {
		this.description = d;
	}

	public void setPrice(int p) {
		this.price = p;
	}
	public void setProductID(int id) {
		this.productID = id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getProductID() {
		return productID;
	}
	
	public void print() {
		System.out.println("Name: " + this.name + "\nDescription" + this.description + "\nPrice: " + this.price + "\nProduct ID: " + this.productID);
	}
}
