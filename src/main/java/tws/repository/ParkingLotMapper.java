package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import tws.entity.ParkingLot;

@Mapper
public interface ParkingLotMapper {
	@Select("select parkinglot_id as parkingLotId,"
			+ "employee_id as parkingBoyId from parkinglot")
    List<ParkingLot> getParkingLots();
	
	@Insert("insert into parkinglot (parkinglot_id) values({parkingLot.id})")
    void insertParkingLot(@Param("parkingLot") ParkingLot parkingLot);
	
	@Update("update parkinglot set employee_id = {employeeid} where parkinglot_id = {parkinglotId}")
	void update(@Param("employeeid") String employeeid, @Param("parkinglotId") String parkinglotId);
}
