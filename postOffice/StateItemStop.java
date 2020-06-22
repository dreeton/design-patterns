package postOffice;

public class StateItemStop implements StateItem{
	
	private String stateName = "STOP";
	@Override
	public String getStateItem() {
		// TODO Auto-generated method stub
		return this.stateName;
	}

	@Override
	public void applyStateItem(ClientSpec clientSpec) {
		// TODO Auto-generated method stub
		clientSpec.setState(this);
		
	}

}

