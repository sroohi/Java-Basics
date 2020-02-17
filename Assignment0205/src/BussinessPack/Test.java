package BussinessPack;

public class Test {
	public static void main(String[] args) {
		CustomerService cs = new CustomerService();

		SaleVolume sv = new SaleVolume();

		sv.setVolume(95.23f);
		sv.setProgress(900);

		Store s = new Store();

		s.setStoreNo(546);
		s.setStoreAddress("8133 Heatherton ln");

		sv.setS(s);
		cs.returns(sv);

	}

}
