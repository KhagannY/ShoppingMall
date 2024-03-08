//Kaan Yavas
public class Top extends Clothing{
	public Top() {
		this(20.0);
	}
	
	public Top(double basePrice) {
		super.setBasePrice(basePrice);
	}
	
	public double calculatePrice() {
		double result = super.getBasePrice() + super.getBasePrice() * super.getVat();
		result *= 120.0;
		result /= 100.0;
		return result;	
	}

	@Override
	public void howToWash() {
		System.out.println("Wash Top at 40 degrees.");
	}
	
}
