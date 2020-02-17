package FirstSession;

public class UberTest {
	public static void main(String[] args) {
		UberService us = new UberService();

		Driver d = new Driver();
		d.setName("Shawn");
		d.setDl(852741);

		Vehicle v = new Vehicle();
		v.setMake("CHEVY");
		v.setModel("IMPALA");

		d.setV(v);
		us.driveUber(d);

	}

}
