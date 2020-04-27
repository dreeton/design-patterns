package functions;

public class CarRemote {
	
	private Functions functions;
	
	public void setFunction(Functions functions) {
		this.functions = functions;
	}
	
	public void pressButton() {
		System.out.println("Do ");
		this.functions.execute();
	}


}




