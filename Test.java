package project;

import java.util.Scanner;

public class Test {

	static int choice;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		/* Phone p = new Phone("apple", "iphone 6",  64, "iphone6", "apple smart phone", 600, 10000 );
		Phone p1 = new Phone("Samsung", "galaxy 8", 32, "Samsung galaxy 8", "Samsung androind smart phone", 550, 10001);
		ProductDB database = new ProductDB();
		database.add(p1);
		database.add(p);
		Customer Mary = new Customer("Mary M", "16 test av.");
		Order o = new Order();
		o.add(p,12);
		o.add(p1,1);8 */

		System.out.println("1. Create a new phone. \n" +
				"2. Create a new Customer. \n" +
				"3. Search for a product by supplying the productid. \n" +
				"4. Display all products in the database. \n" +
				"5. Allow a customer to order some products. \n" +
				"6. Display all orders that a customer has made and all the products that are in a given order. \n" +
				"7. Display all orders for a given product by supplying the productid. \n" +
				"8. Quit\n\n");
		System.out.print("What qould you like to do:");
		choice = s.nextInt();
		if (choice == 1) {
			System.out.print("make of the phone:");
			String make = s.next();
			System.out.print("model of the phone:");
			String model = s.next();
			System.out.print("storage on the phone:");
			int storage = s.nextInt();
			System.out.print("name:");
			String name = s.next();
			System.out.print("description:");
			String desc = s.next();
			System.out.print("price:");
			int price = s.nextInt();
			System.out.print("product id:");
			int id = s.nextInt();
			Phone p = new Phone(make, model, storage, name, desc, price, id);
		}
		if (choice == 2) {
			System.out.print("name");
			String name = s.next();
			System.out.print("address:");
			String address = s.next();
			Customer c = new Customer(name, address);
		}
		if (choice == 3) {
			System.out.print("id:");
			int id = s.nextInt();
			ProductDB.get(id);
		}
		if (choice == 4) {
			ProductDB.displayAll();
		}
		if (choice == 5) {
			System.out.print("product id");
			int p = s.nextInt();
			System.out.println("quantity:");
			int q = s.nextInt();
			Order.add(p, q);
		}
		if (choice == 6) {
			Order.displayAll();
		}
		if (choice == 7) {
			Order.displayAll();
		}
		if (choice == 8) {
			System.exit(0);
		}
	}

}
