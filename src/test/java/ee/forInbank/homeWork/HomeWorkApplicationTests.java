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
//		double customerid = 49002010965L;
//		double loanamount = 6000.0;
//		int loanperiod = 12;

		this.mockMvc.perform(get("http://localhost:8080/loan-decision")
				.contentType("application/json")
				.param("customerid", "49002010965")
				.param("loanamount", "6000")
				.param("loanperiod", "12"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Apologies, Your loan application is denied")));
	}
}
