//Kaan Yavas
public abstract class Item {
	private double vat;
	private double basePrice;
	
	public double getVat() {
		return this.vat;
	}
	
	public void setVat(double vat) {
		this.vat = vat;
	}
	
	public double getBasePrice() {
		return this.basePrice;
	}
	
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	
	abstract public double calculatePrice();
}
