package ee.forInbank.homeWork;

import ee.forInbank.homeWork.loanDecisionController.LoanDecisionController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class HomeWorkApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private LoanDecisionController loanDecisionController;

	@Test
	void setLoanDecisionController() throws Exception{

		this.mockMvc.perform(get("loan-decision"))
				.contentType("application/json")
				.param("customerid", "loanamount", "loanperiod")
				.andExpect(status().isOk())
				.andExpect(content().string(containstString("st")));
	}
}
