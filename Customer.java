
public  abstract class Customer {
    private String name;
    private double amount;

    public Customer(String name, double amount) {
		this.name = name;
		this.amount = amount;
    }

    public String getName() {
		return this.name;
    }

    public void setName(String name) {
		this.name = name;
    }
	
	public void setName(double amount){
		this. amount = amount; 
	}

	
    public abstract double calculateBill();
}
