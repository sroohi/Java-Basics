package ExceptionHandling;

public class AssertDemo {
	public static void main(String[] args) {
		int withdrawalAmount = 200;
		int currentBalance = 100;
		assert (withdrawalAmount < currentBalance) : "Withdrawal Amount is more than current balance";

	}

}
