package week1.day4.protection.protected2;

public class TestSafety {

	public static void main(String[] args) {
		Not maybeSafe = new Not(567);
		
		System.out.println("Our protected integer: " + maybeSafe.breakRules());
	}
}
