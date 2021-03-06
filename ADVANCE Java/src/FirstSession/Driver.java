package FirstSession;

public class Driver {
	private Vehicle v;
	private Integer dl;
	private String name;

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
