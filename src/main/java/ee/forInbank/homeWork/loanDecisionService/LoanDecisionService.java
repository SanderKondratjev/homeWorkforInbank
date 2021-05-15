package ee.forInbank.homeWork.loanDecisionService;

import ee.forInbank.homeWork.loanDecisionRepository.LoanDecisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanDecisionService {

    @Autowired
    private LoanDecisionRepository loanDecisionRepository;

    public String loanSum(Double customerId, Double loanAmount, Double loanPeriod) {
        if (loanAmount >= 2000 && loanAmount <= 10000 && loanPeriod >= 12 && loanPeriod <= 60) {
            Double creditModifier = loanDecisionRepository.getCreditModifier(customerId);
            double creditScore;
            creditScore = (creditModifier / loanAmount) * loanPeriod;
            if (creditScore > 1) {

            }
        } else {
            return "Please correct data";
        }


    }
}
