public class Item {
	int index;
	int number;
	Pizza pizza;
	public Item (int index, Pizza pizza, int number) {
		this.index = index;
		this.number = number;
		this.pizza = pizza;		
	}
	
	public void prepare() {
		System.out.println("Item: " + index);
		System.out.println("Type of pizza: " + pizza.getName());
		System.out.println("Qty: " + number + "\n");
		   
	}
	public void make() {
		for (int i = 0; i < number; i++) {
			System.out.println("Making " + pizza.getName());
			System.out.println("Tossing " + pizza.getDough() + " dough");
		    System.out.println("Adding " + pizza.getSauce() + " sauce");
		    System.out.println("Adding " + pizza.getToppings() + " toppings" + "\n");
		}		
	}
}
