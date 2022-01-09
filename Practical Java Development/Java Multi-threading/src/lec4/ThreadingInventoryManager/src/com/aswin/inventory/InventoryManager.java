package lec4.ThreadingInventoryManager.src.com.aswin.inventory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//import java.util.ArrayList;
//import java.util.Vector;

public class InventoryManager {

	/*
	 * Collections framework from java.util package is not Thread safe except Vector
	 */

//	List<Product> soldProductsList = new ArrayList<>();
//	List<Product> purchasedProductsList = new ArrayList<>();
//	Vector vector = new Vector();

	/*
	 * Collections framework from java.util.concurrent package is not Thread safe
	 * except Vector
	 */

	List<Product> soldProductsList = new CopyOnWriteArrayList<>();
	List<Product> purchasedProductsList = new CopyOnWriteArrayList<>();

	public void populateSoldProducts() { // Utility method
		for (int i = 0; i < 1000; i++) {
			Product prod = new Product(i, "test_product_" + i);
			soldProductsList.add(prod);
			System.out.println("ADDED: " + prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void displaySoldProducts() {
		for (Product product : soldProductsList) {
			System.out.println("PRINTING THE SOLD: " + product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
