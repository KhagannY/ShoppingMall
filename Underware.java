//Kaan Yavas
public class Underware extends Clothing{
	public Underware() {
		this(30.0);
	}
	public Underware(double basePrice) {
		super.setBasePrice(basePrice);
	}
	public double calculatePrice() {
		double result = super.getBasePrice() + super.getBasePrice() * super.getVat();
		result *= 145.0;
		result /= 100.0;
		return result;
	}
	public void howToWash() {
		System.out.println("Wash Underware at 60 degrees");
	}
	
}
