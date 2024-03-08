//Kaan Yavas
public class Fruit extends Food implements Vegan, Washable{
	public Fruit() {
		this(6.0);
	}
	
	public Fruit(double basePrice) {
		super.setBasePrice(basePrice);
	}
	
	public double calculatePrice() {
		double result = super.getBasePrice() + super.getBasePrice() * super.getVat();
		result *= 120.0;
		result /= 100.0;
		return result;
	}
	
	public void howToWash() {
		System.out.println("Wash Fruit with cold water.");
	}
	
	public void madeOf() {
		System.out.println("It is made only of fruits.");
	}
}
