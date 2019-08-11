package week1.day4.protection.protected2;

import week1.day4.protection.protected1.SafeOrNot;

public class Not extends SafeOrNot {
	
	public int breakRules () {
		return this.getPrivateNumber();
	}
	
	public Not(int superPrivateNumber) {
		super(superPrivateNumber);
	}
}
