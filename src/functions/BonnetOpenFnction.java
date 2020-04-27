package functions;

public class BonnetOpenFnction implements Functions {

	private Doors bonnet;
	public BonnetOpenFnction(Doors bonnet) {
		this.bonnet = bonnet;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.bonnet.switchBonnetOpen();
	}

}
