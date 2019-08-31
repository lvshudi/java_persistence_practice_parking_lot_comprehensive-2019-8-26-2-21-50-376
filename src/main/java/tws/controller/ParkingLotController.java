package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.ParkingLot;
import tws.repository.ParkingBoyMapper;
import tws.repository.ParkingLotMapper;
import tws.service.ParkingLotService;

@RestController
@RequestMapping("/parkinglot")
public class ParkingLotController {
	@Autowired
	ParkingLotService parkingLotService;
	
	@PostMapping
	public ResponseEntity<ParkingLot> addParkingLot(@RequestBody ParkingLot parkingLot) {
		parkingLotService.insertParkingLot(parkingLot);
		return ResponseEntity.ok(parkingLot);
	}
	
	@GetMapping
	public ResponseEntity<List<ParkingLot>> getParkinglots() {
		List<ParkingLot> parkingLots = parkingLotService.getParkingLots();
		return ResponseEntity.ok(parkingLots);
	}
}
