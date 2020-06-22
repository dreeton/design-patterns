package postOffice;

public class Start extends Laoding {

	public Start() {
		this.level = Laoding.START;
	}
	
	@Override
	protected void writeInf(String inf) {
		// TODO Auto-generated method stub
		System.out.println("Item is START sending. " + inf);
		
	}

}
