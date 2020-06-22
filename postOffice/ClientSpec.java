package postOffice;

public class ClientSpec {
	 private String name;
	    private StateItem stateItem;

	    public ClientSpec(String name){
	        this.name = name;
	    }

	    public StateItem getStateItem() {
	        return stateItem;
	    }

	    public void setState(StateItem stateItem) {
	        this.stateItem = stateItem;
	    }

	    public String getName() {
	        return name;
	    }

}
