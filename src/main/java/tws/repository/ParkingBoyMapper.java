package tws.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;

import java.util.List;

@Mapper
public interface ParkingBoyMapper {
	
	@Select("select employee_id as parkingBoyId from parkingboy")
    List<ParkingBoy> getParkingBoys();
	
	@Insert("insert into parkingboy (employee_id) values(#{parkingBoy.parkingBoyId})")
    void insertParkingBoy(@Param("parkingBoy") ParkingBoy parkingBoy);
	
	@Select("select parkinglot_id as parkingLotId from parkinglot where employee_id = #{parkingBoyId}")
	List<ParkingLot> getParkingLotById(@Param("parkingBoyId") String parkingBoyId);
}
