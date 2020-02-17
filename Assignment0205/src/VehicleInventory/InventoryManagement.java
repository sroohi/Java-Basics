package VehicleInventory;

public class InventoryManagement {
	public void shipping(UpcomingVehicle uv) {
		System.out.println(uv.toString());
		for (InStockVehicle isv : uv.getIsv1()) {
			System.out.println(isv.toString());
			
			
		}
	}

}
