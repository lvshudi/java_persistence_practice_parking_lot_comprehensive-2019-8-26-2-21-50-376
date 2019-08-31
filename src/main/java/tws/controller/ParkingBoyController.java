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

import tws.dto.ParkingBoyDto;
import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;
import tws.repository.ParkingLotMapper;
import tws.service.ParkingBoyService;
import tws.service.ParkingLotService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parkingboy")
public class ParkingBoyController {

	@Autowired
	ParkingBoyService parkingBoyService;
	
	@Autowired
	ParkingLotService parkingLotService;
	
	@GetMapping("")
	public ResponseEntity<List<ParkingBoy>> getParkingBoys() {
		List<ParkingBoy> parkingBoys = parkingBoyService.getParkingboys();
		return ResponseEntity.ok(parkingBoys);
	}

	@PostMapping("")
	public ResponseEntity<ParkingBoy> addParkingBoy(@RequestBody ParkingBoy parkingBoy) {
		parkingBoyService.addParkingBoy(parkingBoy);
		return ResponseEntity.ok(parkingBoy);
	}

	@PostMapping("/{parkingboyId}/parkinglots/{parkinglotId}")
	public ResponseEntity<String> addLotToBoy(@PathVariable("parkingboyId") String employeeid,
			@PathVariable("parkinglotId") String parkinglotId) {
		parkingLotService.connect(employeeid, parkinglotId);
		return ResponseEntity.ok("connect finish");
	}
	
	@GetMapping("/{parkingboyId}/parkinglots")
	public ResponseEntity<ParkingBoyDto> selectParkingBoy(@PathVariable("parkingboyId") String parkingboyId) {
		ParkingBoyDto parkingBoyDto = parkingBoyService.getParkingBoyDto(parkingboyId);
		return ResponseEntity.ok(parkingBoyDto);
	}
}
