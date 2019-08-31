package tws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.dto.ParkingBoyDto;
import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;
import tws.repository.ParkingBoyMapper;

@Service
public class ParkingBoyService {

	@Autowired
	ParkingBoyMapper parkingBoyMapper;
	
	public List<ParkingBoy> getParkingboys() {
		return parkingBoyMapper.getParkingBoys();
	}
	
	public void addParkingBoy(ParkingBoy parkingBoy) {
		parkingBoyMapper.insertParkingBoy(parkingBoy);
	}
	
	public ParkingBoyDto getParkingBoyDto(String parkingBoyId) {
		List<ParkingLot> parkingLots = parkingBoyMapper.getParkingLotById(parkingBoyId);
		ParkingBoyDto parkingBoyDto = new ParkingBoyDto();
		parkingBoyDto.setParkingBoyId(parkingBoyId);
		for (ParkingLot parkingLot : parkingLots) {
			parkingBoyDto.setParkingLot(parkingLot);
		}
		return parkingBoyDto;
	}
}
