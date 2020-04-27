package functions;

public class FunctionsMani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarRemote carRemote = new CarRemote();
		Doors doors = new Doors();
		Doors bonnet = new Doors();
		
		Functions DoorsLockFunction = new DoorsLockFunction(doors);
		Functions DoorsUnLockFunction = new DoorsUnLockFunction(doors);
		Functions BonnetOpenFnction = new BonnetOpenFnction(bonnet);
		
		carRemote.setFunction(DoorsLockFunction);
		carRemote.pressButton();
		carRemote.setFunction(DoorsUnLockFunction);
		carRemote.pressButton();
		carRemote.setFunction(BonnetOpenFnction);
		carRemote.pressButton();
	}

}
