package tws.repository;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class APITest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void return_null_when_query_ParkinglotBoy() throws Exception {
		mockMvc.perform(get("/parkingboy")).andDo(print()).andExpect(status().isOk()).andReturn();
	}

	@Test
	public void return_success_when_insert() throws Exception {
		mockMvc.perform(post("/parkingboy").content("{\r\n" + 
				"	\"parkingBoyId\":\"001\"\r\n" + 
				"}").contentType(MediaType.APPLICATION_JSON_UTF8)).andDo(print()).andExpect(status().isOk()).andReturn();
	}
}
