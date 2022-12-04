public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("270", "society", "110085");
		Customer runner = new Customer("vishal", homeAddress);
		System.out.println(runner);
		Address workAddress = new Address("165", "noida", "32332");
		runner.setWorkAddress(workAddress);
		System.out.println(runner);

	}

}
