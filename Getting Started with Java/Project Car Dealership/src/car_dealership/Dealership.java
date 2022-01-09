package car_dealership;

public class Dealership {

	public static void main(String[] args) {

		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 MGR street");
		cust1.setCashOnHand(1200000);
		
		// Vehicle vehicle = new Vehicle("Honda", "City", 1000000);
		Vehicle vehicle = new Vehicle("BMW", "M3", 4000000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW", "M3", 4000000);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);
		
		/* 
		 * 
		 * handleCustomer( Customer cust, boolean finance, Vehicle vehicle)
		 * 	if(finance == true)
		 * 		runCreditHistory(Customer cust, double doubleAmount)
		 *  else if (vehicle.getPrice() <= cust.cashOnHand()):
		 * 		processTransaction(Customer cust, Vehicle vehicle)
		 *  else:
		 *  	tell customer to bring more money
		 */
	}

}
