package burgerSiteHomeworkPackage;

public abstract class BasicBurgerDecorator implements Burger {
	protected Burger decoratedBurger;

	public BasicBurgerDecorator(Burger decoratedBurger) {
		this.decoratedBurger = decoratedBurger;
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		this.decoratedBurger.create();
	}

}
