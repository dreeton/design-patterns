package burgerSiteHomeworkPackage;

public class EggBurgerDecorator extends BasicBurgerDecorator {

	public EggBurgerDecorator(Burger decoratedBurger) {
		super(decoratedBurger);
	}
	public void create() {
		decoratedBurger.create();
		addEgg(decoratedBurger);
	}
	private void addEgg(Burger decoratedBurger) {
		System.out.println("Add egg in Classic Burger");
	}
}
