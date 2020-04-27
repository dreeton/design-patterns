package functions;

public class DoorsLockFunction implements Functions {

	private Doors doors;
	public DoorsLockFunction(Doors doors) {
		this.doors = doors;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.doors.switchLock();

	}

}
