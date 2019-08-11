package week1.day4.protection.protected1;

public class SafeOrNot {
	protected int superPrivateNumber;

	public SafeOrNot(int superPrivateNumber) {
		this.superPrivateNumber = superPrivateNumber;
	}
	
	protected int getPrivateNumber() {
		return superPrivateNumber;
	}
}
