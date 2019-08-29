package tws.entity;

import org.springframework.stereotype.Component;

@Component
public class ParkingLot {
	private String parkingLotId;

	public String getParkingLotId() {
		return parkingLotId;
	}

	public void setParkingLotId(String parkingLotId) {
		this.parkingLotId = parkingLotId;
	}

	public ParkingLot(String parkingLotId) {
		super();
		this.parkingLotId = parkingLotId;
	}

	public ParkingLot() {
		super();
	}
	
	
}
