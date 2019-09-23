package project;

public class Phone extends Product{
	private String make, model;
	private int storage;
	
	public Phone(String make, String model, int storage, String name, String description, int price, int productID) {
		super(name, description, price, productID);
		setMake(make);
		setModel(model);
		setStorage(storage);
	}
	
	public void setMake(String m) {
		this.make = m;
	}
	
	public void setModel(String m) {
		this.model = m;
	}
	
	public void setStorage(int s) {
		this.storage = s;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}

	public int getStorage() {
		return storage;
	}
	
	public void print() {
		super.print();
		System.out.println("Make: " + this.make + "\nModel: " + this.model + "\nStorage: " + this.storage);
		
	}
}
