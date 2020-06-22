package postOffice;

public class Midle extends Laoding {
	public Midle() {
		this.level = Laoding.MIDLE;
	}
	
	@Override
	protected void writeInf(String inf) {
		// TODO Auto-generated method stub
		System.out.println("Item is MIDLE sending. " + inf);
	}

	}


