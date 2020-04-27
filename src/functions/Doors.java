package functions;

public class Doors {
	private Boolean doorsLock;
	private Boolean bonnetOpen;

	public void switchLock()	{
		System.out.println("Doors are Lock");
		this.doorsLock = true;
	}
	public void switchUnLock() {
		System.out.println("Doors are Unlock");
		this.doorsLock = false;
	}
	public void switchBonnetOpen() {
		System.out.println("Bonnet is Open");
		this.bonnetOpen = true;
	}
}
