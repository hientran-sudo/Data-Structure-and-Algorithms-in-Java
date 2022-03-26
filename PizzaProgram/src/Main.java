import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int store,cont,type,qty;
	static int index = 1;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		PizzaStore nystore = new PizzaStore();
		List <Item> order = new ArrayList<>();
		
		System.out.println("Welcome");
		System.out.println("--Pick a store--");
		System.out.println("1. New York store");
		System.out.println("2. Chicago store");
		store = scan.nextInt();
		
		//Choose store
		switch(store) {
		case 1:			
			do {
				new Menu();
				
				type = scan.nextInt();
				System.out.println("How many do you want?");
				qty = scan.nextInt();
				if (type == 1) {
					order.add(new Item (index, new CheesePizza(), qty));
					index++;
				}
				else {
					order.add(new Item (index, new HawaiiPizza(), qty));
					index++;
				}
							
				System.out.println("\nAnything else? Put 1 as Yes or 0 as No");
				cont = scan.nextInt();
			}
			while(cont == 1);
			System.out.println("Order has: " );		
			for (Item i : order) {
				nystore.getOrder(i);			
			}
			
			System.out.println("Prepare order:" );
			for (Item i : order) {
				nystore.makePizza(i);
			}
			break;
		case 2:
			break;
		}
		
		/*PizzaStore nystore = new PizzaStore();
		
		List <Item> order1 = new ArrayList<>();
		order1.add(new Item (1, new CheesePizza(), 2));
		order1.add(new Item (2, new HawaiiPizza(), 1));
		
		System.out.println("Order has: " );		
		for (Item i : order1) {
			nystore.getItem(i);			
		}
		
		System.out.println("Prepare order:" );
		for (Item i : order1) {
			nystore.makePizza(i);
		}*/			
		}
		
}
