
public class UberService {
	public void UberDriver(Driver d) {
		System.out.println(d.toString());
		for (Vehicle v : d.getV1()) {
			System.out.println(v.toString());
		}
	}

}
