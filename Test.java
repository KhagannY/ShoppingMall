//Kaan Yavas
public class Test {

	public static void main(String[] args) {
		ShoppingMall shoppingMall = new ShoppingMall();
		shoppingMall.addDairy();
		shoppingMall.addFruit();
		shoppingMall.addTop();
		shoppingMall.addTrousers();
		shoppingMall.addUnderware();
		shoppingMall.addVegetable();
		shoppingMall.addArbitrary(new Top(100));
		
		printContent(shoppingMall);
		printWashingInstructions(shoppingMall);
		
		System.out.println(shoppingMall.bill());
		
	}
	public static void printContent(ShoppingMall shoppingMall) {
		for(int i = 0; i < shoppingMall.getItems().size(); i++) {
			if((Item)(shoppingMall.getItems().get(i)) instanceof Vegan) {
				((Vegan) shoppingMall.getItems().get(i)).madeOf();
			}
		}
	}
	
	public static void printWashingInstructions(ShoppingMall shoppingMall) {
		for(int i = 0; i < shoppingMall.getItems().size(); i++) {
			if((Item)(shoppingMall.getItems().get(i)) instanceof Washable) {
				((Washable) shoppingMall.getItems().get(i)).howToWash();
			}
		}
	}
}
