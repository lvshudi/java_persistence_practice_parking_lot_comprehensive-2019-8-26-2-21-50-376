package tws.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tws.entity.ParkingBoy;

import java.util.List;

@Mapper
public interface ParkingBoyMapper {
	@Select("select * from parkingboy")
    List<ParkingBoy> getParkingBoys();
	
	@Insert("insert into parkingboy values({parkingBoy.id})")
    void insertParkingBoy(@Param("parkingBoy") ParkingBoy parkingBoy);
}
