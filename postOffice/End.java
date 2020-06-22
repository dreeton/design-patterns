package postOffice;

public class End extends Laoding {
	public End() {
		this.level = Laoding.END;
	}
	
	@Override
	protected void writeInf(String inf) {
		// TODO Auto-generated method stub
		System.out.println("Item is END sending. " + inf);
	}

}
