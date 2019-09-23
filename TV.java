package project;

public class TV extends Product{
	private String make, type;
	private int screenSize;
	private boolean threeDCompatable;
	
	public TV(String make, int screeSize, String type, boolean threeDCompatable, String name, String description, int price, int productID) {
		super(name, description, price, productID);
		setMake(make);
		setScreenSize(screenSize);
		setType(type);
		setThreeDCompatable(threeDCompatable);
	}
	
	public void setMake(String m) {
		this.make = m;
	}
	
	public void setScreenSize(int ss) {
		this.screenSize = ss;
	}
	
	public void setType(String t) {
		this.type = t;
	}
	
	public void setThreeDCompatable(boolean three) {
		this.threeDCompatable = three;
	}
	
	public String getMake() {
		 return this.make;
	}
	
	public int getScreenSize() {
		return this.screenSize;
	}
	
	public String getType() {
		return this.type;
	}
	
	public boolean getThreeDCompatable() {
		return this.threeDCompatable;
	}
	
	public void print() {
		super.print();
		System.out.println("Make: " + this.make + "\nScreenSize: " + screenSize + "\nType: " + this.type + "\n3D: " + this.threeDCompatable);
	}
}
