package ee.forInbank.homeWork.loanDecisionDTO;

public class Customers {
    public Double customerId;
    private String segment;
    private Double creditModifier;

    public Double getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Double customerId) {
        this.customerId = customerId;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public Double getCreditModifier() {
        return creditModifier;
    }

    public void setCreditModifier(Double creditModifier) {
        this.creditModifier = creditModifier;
    }
}
