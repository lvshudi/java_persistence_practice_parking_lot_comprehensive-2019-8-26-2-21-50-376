package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;
import tws.repository.ParkingLotMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parkingboy")
public class ParkingBoyController {

	@Autowired
	ParkingBoyMapper parkingBoyMapper;
	
	@Autowired
	ParkingLotMapper parkingLotMapper;
	
	@GetMapping("")
	public ResponseEntity<List<ParkingBoy>> getParkingBoys() {
		List<ParkingBoy> parkingBoys = parkingBoyMapper.getParkingBoys();
		return ResponseEntity.ok(parkingBoys);
	}

	@PostMapping("")
	public ResponseEntity<ParkingBoy> addParkingBoy(@RequestBody ParkingBoy parkingBoy) {
		parkingBoyMapper.insertParkingBoy(parkingBoy);

		return ResponseEntity.ok(parkingBoy);
	}

	@PostMapping("/{parkingboyId}/parkinglot/{parkinglotId}")
	public ResponseEntity<String> addLotToBoy(@PathVariable("parkingboyId") String employeeid,
			@PathVariable("parkinglotId") String parkinglotId) {
		parkingLotMapper.update(employeeid, parkinglotId);
		return ResponseEntity.ok("connect finish");
	}
}
