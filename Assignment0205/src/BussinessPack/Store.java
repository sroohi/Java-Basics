package BussinessPack;

public class Store {
	private Integer storeNo;
	private String storeAddress;

	public Integer getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(Integer storeNo) {
		this.storeNo = storeNo;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	@Override
	public String toString() {
		return "Store [storeNo=" + storeNo + ", storeAddress=" + storeAddress + "]";
	}

}
