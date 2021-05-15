package ee.forInbank.homeWork.loanDecisionController;

import ee.forInbank.homeWork.loanDecisionService.LoanDecisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LoanDecisionController {

    @Autowired
    private LoanDecisionService loanDecisionService;

//    http://localhost:8080/loandecision?customerId=49002010998&loanAmount=4000&loanPeriod=12
    @GetMapping("loandecision")
    public String loanSum(@RequestParam("customerid") Double customerId,
                          @RequestParam("loanamount") Double loanAmount,
                          @RequestParam("loanperiod") Double loanPeriod) {
        return loanDecisionService.loanSum(customerId, loanAmount, loanPeriod);
    }
}
