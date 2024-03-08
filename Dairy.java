//Kaan Yavas
public class Dairy extends Food{
	
	public Dairy() {
		this(8.0);
	}
	
	public Dairy(double basePrice) {
		super.setBasePrice(basePrice);
	}
	
	public double calculatePrice() {
		double result = super.getBasePrice() + super.getVat() * super.getBasePrice();
		result*= 130.0;
		result/= 100.0;
		return result;
	}
}
