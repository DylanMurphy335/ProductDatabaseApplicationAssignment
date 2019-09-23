package project;

import java.util.ArrayList;

public class ProductDB {
	static ArrayList<Object> products;
	
	public ProductDB() {
		products = new ArrayList<Object>();
	}
	
	public static void add(Object obj) {
		products.add(obj);
	}
	
	public static void remove(int num) {
		products.remove(num);
	}
	
	public static Object get(int id) {
		return products.get(id);
	}
	
	public static void displayAll() {
		for (int i=0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}
	}
}
