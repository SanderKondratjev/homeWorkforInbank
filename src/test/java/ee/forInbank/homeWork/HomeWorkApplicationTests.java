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
	void debtCustomer() throws Exception{

		this.mockMvc.perform(get("http://localhost:8080/loan-decision")
				.contentType("application/json")
				.param("customerid", "49002010965")
				.param("loanamount", "6000")
				.param("loanperiod", "12"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Apologies, Your loan application is denied")));
	}
	@Test
	void segmentOneCustomer() throws Exception{

		this.mockMvc.perform(get("http://localhost:8080/loan-decision")
				.contentType("application/json")
				.param("customerid", "49002010976")
				.param("loanamount", "6000")
				.param("loanperiod", "12"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Apologies, no suitable loan amount was found. The maximum loan period for that amount would be 60 months.")));
	}
	@Test
	void segmentTwoCustomer() throws Exception{

		this.mockMvc.perform(get("http://localhost:8080/loan-decision")
				.contentType("application/json")
				.param("customerid", "49002010987")
				.param("loanamount", "6000")
				.param("loanperiod", "12"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Apologies, the maximum amount you can request is 3600.0 EUR.")));
	}
	@Test
	void segmentThreeCustomer() throws Exception{

		this.mockMvc.perform(get("http://localhost:8080/loan-decision")
				.contentType("application/json")
				.param("customerid", "49002010998")
				.param("loanamount", "6000")
				.param("loanperiod", "12"))
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Your loan application is positive. The maximum amount you can request is 10000 EUR")));
	}
}
