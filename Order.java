package project;

import java.util.ArrayList;

public class Order {
	static ArrayList<Object> order;
	
	public Order() {
		order = new ArrayList<Object>();
	}
	
	public static void add(Object obj, int quant) {
		for (int i=0; i<quant; i++) {
			order.add(obj);
		}
	}
	
	public static void remove(int num) {
		order.remove(num);
	}
	
	public static Object get(int id) {
		return order.get(id);
	}
	
	public static void displayAll() {
		for (int i=0; i < order.size(); i++) {
			System.out.println(order.get(i));
		}
	}
}
