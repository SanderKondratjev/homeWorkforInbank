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

//    TODO testcase 1: http://localhost:8080/loandecision?customerid=49002010965&loanamount=6000&loanperiod=12
//    TODO testcase 2: http://localhost:8080/loandecision?customerid=49002010976&loanamount=6000&loanperiod=12
//    TODO testcase 3: http://localhost:8080/loandecision?customerid=49002010987&loanamount=6000&loanperiod=12
//    TODO testcase 4: http://localhost:8080/loandecision?customerid=49002010998&loanamount=6000&loanperiod=12

    @GetMapping("loandecision")
    public String loanSum(@RequestParam("customerid") Double customerId,
                          @RequestParam("loanamount") Double loanAmount,
                          @RequestParam("loanperiod") Integer loanPeriod) {
        return loanDecisionService.loanSum(customerId, loanAmount, loanPeriod);
    }
}
