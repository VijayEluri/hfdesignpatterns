package info.sudr.hfdp.pizza.factory;

import info.sudr.hfdp.pizza.Pizza;
import info.sudr.hfdp.pizza.Pizza.Type;
import info.sudr.hfdp.pizza.ny.NYStyleCheesePizza;
import info.sudr.hfdp.pizza.ny.NYStyleClamPizza;
import info.sudr.hfdp.pizza.ny.NYStylePepperoniPizza;
import info.sudr.hfdp.pizza.ny.NYStyleVeggiePizza;

public class NYPizzaFactory implements SimplePizzaFactory {

	public Pizza createPizza(Type type) {
		switch (type) {
		case CHEESE:
			return new NYStyleCheesePizza();
		case CLAM:
			return new NYStyleClamPizza();
		case PEPPERONI:
			return new NYStylePepperoniPizza();
		case VEGGIE:
			return new NYStyleVeggiePizza();
		default:
			throw new RuntimeException("we do not have " + type + " pizzas");
		}
	}

}
