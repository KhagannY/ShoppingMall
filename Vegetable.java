//Kaan Yavas
public class Vegetable extends Food implements Vegan, Washable{
	public Vegetable() {
		this(10.0);
	}
	public Vegetable(double basePrice) {
		super.setBasePrice(basePrice);
	}
	
	public double calculatePrice() {
		double result = super.getBasePrice() + super.getBasePrice() * super.getVat();
		result *= 125.0;
		result /= 100.0;
		return result;
	}
	
	public void howToWash() {
		System.out.println("Wash Vegetable with warm water.");
	}
	
	public void madeOf() {
		System.out.println("It is made only of vegetables.");
	}
}
