package tws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.entity.ParkingLot;
import tws.repository.ParkingLotMapper;

@Service
public class ParkingLotService {

	@Autowired
	ParkingLotMapper parkingLotMapper;
	
	public void insertParkingLot(ParkingLot parkingLot) {
		parkingLotMapper.insertParkingLot(parkingLot);
	}
	
	public void connect(String employeeId, String parkingLotId) {
		parkingLotMapper.update(employeeId, parkingLotId);
	}
	
	public List<ParkingLot> getParkingLots() {
		List<ParkingLot> parkingLots = parkingLotMapper.getParkingLots();
		return parkingLots;
	}
}
