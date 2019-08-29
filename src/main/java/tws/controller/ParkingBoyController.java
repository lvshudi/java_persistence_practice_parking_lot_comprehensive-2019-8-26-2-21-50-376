package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parkingBoy")
public class ParkingBoyController {

	@Autowired
	ParkingBoyMapper parkingBoyMapper;
    
    @GetMapping("")
    public ResponseEntity<List<ParkingBoy>> getParkingBoys() {
    	List<ParkingBoy> parkingBoys = parkingBoyMapper.getParkingBoys();
    	return ResponseEntity.ok(parkingBoys);
    }
    
    @PostMapping("")
    public ResponseEntity<ParkingBoy> addParkingBoy(@RequestBody ParkingBoy parkingBoy) {
    	parkingBoyMapper.insertParkingBoy(parkingBoy);
    	
    	return ResponseEntity.created(URI.create("parking boy is created")).build();
    }
    
}
