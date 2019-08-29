package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tws.entity.ParkingLot;

@Mapper
public interface ParkingLotMapper {
	@Select("select * from parkinglot")
    List<ParkingLot> getParkingLots();
	
	@Insert("insert into parkinglot (parkinglot_id) values({parkingLot.id})")
    void insertParkingLot(@Param("parkingLot") ParkingLot parkingLot);
}
