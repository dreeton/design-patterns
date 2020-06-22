package postOffice;

public class StateItemStart implements StateItem{
	
	private String stateName = "START";
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

