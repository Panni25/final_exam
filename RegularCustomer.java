public class RegularCustomer extends Customer {
	private int amount;
    public RegularCustomer(String name, double amount) {
		super(name, amount);
    }

    @Override
    public double calculateBill() {
		return this.amount;
    }
}
