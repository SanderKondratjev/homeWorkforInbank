package ee.forInbank.homeWork.loanDecisionService;

import ee.forInbank.homeWork.loanDecisionRepository.LoanDecisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanDecisionService {

    @Autowired
    private LoanDecisionRepository loanDecisionRepository;

    public String loanSum(Double customerId, Double loanAmount, Integer loanPeriod) {
        if (loanAmount >= 2000 && loanAmount <= 10000 && loanPeriod >= 12 && loanPeriod <= 60) {
            Double creditModifier = loanDecisionRepository.getCreditModifier(customerId);
            double creditScore;
            creditScore = (creditModifier / loanAmount) * loanPeriod;
            if (creditScore < 1) {
                Double maxLoanAmount = creditModifier * loanPeriod;
                Double maxLoanPeriod = loanPeriod / creditScore;
                if (maxLoanAmount >= 2000 && maxLoanAmount <= 10000) {
                    return "Apologies, the maximum amount you can request is " +
                            maxLoanAmount + " EUR.";
                } else if (maxLoanPeriod >= 12 && maxLoanPeriod <= 60) {
                    return "Apologies, no suitable loan amount was found. The maximum loan period for that amount would be "
                            + Math.round(maxLoanPeriod) + " months.";
                } else {
                    return "Apologies, Your loan application is denied";
                }
            } else {
                Double maxLoanAmount = creditModifier * loanPeriod;
                if (maxLoanAmount >= 10000) {
                    return "Your loan application is positive. The maximum amount you can request is 10000 EUR";
                } else {
                    return "Your loan application is positive. The maximum amount you can request is " + maxLoanAmount;
                }
            }
        }
        return "Please correct data";
    }
}