package tws.dto;

import java.util.ArrayList;
import java.util.List;

import tws.entity.ParkingLot;

public class ParkingBoyDto {
	private String parkingBoyId;
	private List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();

	public ParkingBoyDto(String parkingBoyId, ParkingLot parkingLot) {
		super();
		this.parkingBoyId = parkingBoyId;
		parkingLots.add(parkingLot);
	}

	public ParkingBoyDto() {
		super();
	}

	public String getParkingBoyId() {
		return parkingBoyId;
	}

	public void setParkingBoyId(String parkingBoyId) {
		this.parkingBoyId = parkingBoyId;
	}

	public List<ParkingLot> getParkingLotId() {
		List<ParkingLot> returnParkingLots = new ArrayList<ParkingLot>();
		returnParkingLots.addAll(parkingLots);
		return returnParkingLots;
	}

	public void setParkingLot(ParkingLot parkingLot) {
		parkingLots.add(parkingLot);
	}

}
