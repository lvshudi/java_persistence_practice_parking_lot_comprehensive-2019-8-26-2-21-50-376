package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.ParkingLot;
import tws.repository.ParkingBoyMapper;
import tws.repository.ParkingLotMapper;

@RestController
@RequestMapping("/parkinglot")
public class ParkingLotController {
	@Autowired
	ParkingLotMapper parkingLotMapper;
	
	@PostMapping
	public ResponseEntity<ParkingLot> addParkingLot(@RequestBody ParkingLot parkingLot) {
		parkingLotMapper.insertParkingLot(parkingLot);
		return ResponseEntity.ok(parkingLot);
	}
}
