package functions;

public class DoorsUnLockFunction implements Functions {

	private Doors doors;
	public DoorsUnLockFunction(Doors doors) {
		this.doors = doors;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.doors.switchUnLock();
	}

}
