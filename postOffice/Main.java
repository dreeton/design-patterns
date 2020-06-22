package postOffice;

public class Main {
	
    public static void main(String[] args) {

    	Laoding chain = getChain();
    	StateItemStart stateItemStart = new StateItemStart();
    	StateItemStop stateItemStop = new StateItemStop();
    	ClientSpec clientSpec = new ClientSpec("Ivan Ivanov");

        stateItemStart.applyStateItem(clientSpec);
        StateItem stateItem = clientSpec.getStateItem();
        String currState = stateItem.getStateItem();
        System.out.println(currState);
        
        chain.writeInf("Mail " + clientSpec.getName());
        stateItemStop.applyStateItem(clientSpec);
        stateItem = clientSpec.getStateItem();
        currState = stateItem.getStateItem();
        System.out.println(currState);
    }

	
    public static Laoding getChain(){
    	Laoding startLaoding = new Start();
    	Laoding endLaoding = new End();
    	Laoding midleLaoding = new Midle();

    	midleLaoding.secLaoding(endLaoding);
    	endLaoding.secLaoding(startLaoding);
        return midleLaoding;
    }
    
}
