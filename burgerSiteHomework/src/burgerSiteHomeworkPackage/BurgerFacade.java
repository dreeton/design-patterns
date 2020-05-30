package burgerSiteHomeworkPackage;

public class BurgerFacade {

	private Burger classic;
	private Burger classicWithEgg;
	private Burger classicWithCheese;
public BurgerFacade(){
		
		this.classic = new BasicBurger();
		this.classicWithEgg = new EggBurgerDecorator(classic);
		this.classicWithCheese = new CheeseBurgerDecorator(classic);
	}
public void getClassicBurger(){
	System.out.println("Classic Burger Ordered");
}
public void getClassicBurgerCheese(){
	System.out.println("Cheese Burger Ordered");
}
public void getClassicBurgerEgg(){
	System.out.println("Egg Burger Ordered");
}

}

