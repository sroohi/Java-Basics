package SubcribtionPack;

public class Subscribers {
	private Integer onlineId;
	private String name;

	public Integer getOnlineId() {
		return onlineId;
	}

	public void setOnlineId(Integer onlineId) {
		this.onlineId = onlineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subscribers [onlineId=" + onlineId + ", name=" + name + "]";
	}

}
