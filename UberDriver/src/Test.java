import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		UberService us = new UberService();

		Vehicle v = new Vehicle();
		v.setColor("Blue");
		v.setMake("Jeep");
		v.setModel("Cherokee");

		Vehicle v1 = new Vehicle();
		v1.setColor("Black");
		v1.setMake("Acura");
		v1.setModel("SUV");

		Vehicle v2 = new Vehicle();
		v2.setColor("White");
		v2.setMake("Mazda");
		v2.setModel("M3");

		List<Vehicle> vlist = new ArrayList<Vehicle>();
		vlist.add(v);
		vlist.add(v1);
		vlist.add(v2);

		Driver d = new Driver();
		d.setDl(8525641);
		d.setName("Shawn");
		d.setV1(vlist);

		us.UberDriver(d);

	}

}
