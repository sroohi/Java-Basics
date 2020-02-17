package SubcribtionPack;

public class Test {
	public static void main(String[] args) {
		OnlineSupportTeam ost = new OnlineSupportTeam();
		Subscribers sc = new Subscribers();
		sc.setName("SHAWN");
		sc.setOnlineId(2210050);
		ost.monthlyPayment(sc);

	}

}
