import java.util.List;

public class Driver {

	private Vehicle v;
	private Integer dl;
	private String name;
	public List<Vehicle> v1;

	public List<Vehicle> getV1() {
		return v1;
	}

	public void setV1(List<Vehicle> v1) {
		this.v1 = v1;
	}

	public Integer getDl() {
		return dl;
	}

	public String getName() {
		return name;
	}

	public void setDl(Integer dl) {
		this.dl = dl;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Driver [dl=" + dl + ", name=" + name + "]";
	}

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

}
