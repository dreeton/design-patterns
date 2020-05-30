package burgerSiteHomeworkPackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burger Classic= new BasicBurger();
		Classic.create();
		
		Burger secondClassicBurger = new BasicBurger();
		Burger secb =new CheeseBurgerDecorator(secondClassicBurger);
		secb.create();
		
		Burger thirdClassicBurger = new BasicBurger();
		Burger thrb =new CheeseBurgerDecorator(secondClassicBurger);
		thrb.create();
				
		
		BurgerFacade burgerfacade = new BurgerFacade();
		burgerfacade.getClassicBurger();
		burgerfacade.getClassicBurgerEgg();
		burgerfacade.getClassicBurgerCheese();
		
		
		
	}

}
