package burgerSiteHomeworkPackage;

public class CheeseBurgerDecorator extends BasicBurgerDecorator {

	public CheeseBurgerDecorator(Burger decoratedBurger) {
		super(decoratedBurger);
	}
	public void create() {
		decoratedBurger.create();
		addCheese(decoratedBurger);
	}
	private void addCheese(Burger decoratedBurger) {
		System.out.println("Add cheese in Classic Burger");
	}
}
