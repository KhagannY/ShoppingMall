//Kaan Yavas
public class Trousers extends Clothing{
	public Trousers() {
		this(40.0);
	}
	public Trousers(double basePrice) {
		super.setBasePrice(basePrice);
	}
	
	public double calculatePrice() {
		double result = super.getBasePrice() + super.getBasePrice() * super.getVat();
		result *= 120.0;
		result /= 100.0;
		return result;
	}
	
	public void howToWash() {
		System.out.println("Wash Trousers at 30 degrees.");
	}
}
