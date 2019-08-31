package tws.entity;

import org.springframework.stereotype.Component;

@Component
public class ParkingLot {
	private String parkingLotId;
	private int availablePositionCount;
	private int positionCount;
	private String parkingBoyId;
	
	public ParkingLot() {
		super();
	}

	public ParkingLot(String parkingLotId, int availablePositionCount, int positionCount) {
		super();
		this.parkingLotId = parkingLotId;
		this.availablePositionCount = availablePositionCount;
		this.positionCount = positionCount;
	}

	public int getAvailablePositionCount() {
		return availablePositionCount;
	}

	public void setAvailablePositionCount(int availablePositionCount) {
		this.availablePositionCount = availablePositionCount;
	}

	public int getPositionCount() {
		return positionCount;
	}

	public void setPositionCount(int positionCount) {
		this.positionCount = positionCount;
	}

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

	public String getParkingBoyId() {
		return parkingBoyId;
	}

	public void setParkingBoyId(String parkingBoyId) {
		this.parkingBoyId = parkingBoyId;
	}

	
	
	
}
