//Kaan Yavas
import java.util.ArrayList;

public class ShoppingMall {
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public ArrayList<Item> getItems(){
		return this.items;
	}
	
	public void addDairy(){
		items.add(new Dairy());
	}
	
	public void addFruit() {
		items.add(new Fruit());
	}
	
	public void addTop() {
		items.add(new Top());
	}
	
	public void addTrousers() {
		items.add(new Trousers());
	}
	
	public void addUnderware() {
		items.add(new Underware());
	}
	
	public void addVegetable() {
		items.add(new Vegetable());
	}
	
	public void addArbitrary(Item item) {
		items.add(item);
	}
	
	public double bill() {
		double totalPrice = 0.0;
		for(int i = 0; i < items.size(); i++) {
			totalPrice += items.get(i).calculatePrice();
		}
		return totalPrice;
	}
}
