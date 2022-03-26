
public  class PizzaStore {
	public Item getOrder(Item item) {
		 item.prepare();
		 return item;
	}
		
	public Item makePizza(Item item) {
		item.make();
		return item;		
	}

}
