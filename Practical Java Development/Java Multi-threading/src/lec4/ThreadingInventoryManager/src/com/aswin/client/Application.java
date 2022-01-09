package lec4.ThreadingInventoryManager.src.com.aswin.client;

import lec4.ThreadingInventoryManager.src.com.aswin.inventory.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		InventoryManager manager = new InventoryManager();

		Thread inventoryTask = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.populateSoldProducts();
			}

		});

		Thread displayTask = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.displaySoldProducts();
			}

		});

		inventoryTask.start();
		Thread.sleep(2000);
		/*
		 * Method 1: To make sure we have some data in the ArrayList let's wait to print
		 * using the displayTask Thread
		 * 
		 * Thread.sleep(20000); // Primitive way, Does not solve the problem
		 */

		/*
		 * Method 2: Pause the main thread until the inventoryTask completes the task -
		 * Primitive way, Does not solve the problem.
		 * 
		 * This does not make it Multi-threading
		 * 
		 * inventoryTask.join();
		 */

		displayTask.start();

	}

}
