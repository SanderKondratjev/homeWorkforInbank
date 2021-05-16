package ee.forInbank.homeWork;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class HomeWorkApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void loanDecisionTest() throws Exception{

		this.mockMvc.perform(get("loan-decision?customerid=49002010965&loanamount=6000&loanperiod=12")
				.contentType("application/json")
				.param("justName", "customerid","loanamount", "loanperiod"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("st")));
	}
}
