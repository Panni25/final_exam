public class Main {
    public static void main(String[] args) {
		Customer c = new RegularCustomer("Steph", 400);
		RegularCustomer rc = new RegularCustomer("Kyla", 300);
		SeniorCustomer sc = new SeniorCustomer("Mel", 100);

		// print bill for regular customer
		System.out.println("Bill for the regular customer: " + c.calculateBill());

		// print bill for regular customer
		System.out.println("Bill for the regular customer: " + rc.calculateBill());

		// print bill for senior customer
		System.out.println("Bill for the senior customer: " + sc.calculateBill());
    }
}
