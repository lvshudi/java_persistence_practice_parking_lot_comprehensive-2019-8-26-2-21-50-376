package tws.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ParkingBoy implements Serializable {
    private String parkingBoyId;

	public String getParkingBoyId() {
		return parkingBoyId;
	}

	public void setParkingBoyId(String parkingBoyId) {
		this.parkingBoyId = parkingBoyId;
	}

	public ParkingBoy(String parkingBoyId) {
		super();
		this.parkingBoyId = parkingBoyId;
	}

	public ParkingBoy() {
		super();
	}
    
    
}
