package tws.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;

import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@MybatisTest
public class PackinglotMapperTest {
    @Autowired
    private ParkingLotMapper packinglotMapper;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {

        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @After
    public void tearDown() throws Exception {
        JdbcTestUtils.deleteFromTables(jdbcTemplate, "parkinglot");
    }

    @Test
    public void shouldFetchEmployee() {
        //given 已经有值不用传入参数了

        //when
        List<ParkingLot> packingLots = packinglotMapper.getParkingLots();
        //then
        assertEquals(4, packingLots.size());
    }
}
