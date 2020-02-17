package VehicleInventory;

public class InStockVehicle {
	private String location;
	private String quantity;
	private Integer days;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "InStockVehicle [location=" + location + ", quantity=" + quantity + ", days=" + days + "]";
	}
	

}
