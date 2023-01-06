public class SeniorCustomer extends Customer {
    private static final double DISCOUNT = 0.20;
	private int amount;

    public SeniorCustomer(String name, double amount) {
		super(name, amount);
    }

    @Override
    public double calculateBill() {
		return this.amount - (this.amount * DISCOUNT);
    }
}
