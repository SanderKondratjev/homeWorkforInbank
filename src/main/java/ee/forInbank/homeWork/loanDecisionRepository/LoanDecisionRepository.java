package ee.forInbank.homeWork.loanDecisionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class LoanDecisionRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public Double getCreditModifier(double customerId) {
        String sql = "SELECT credit_modifier FROM customers WHERE customer_id=:dbCustomerId";
        Map<String, Object> creditModifierMap = new HashMap<>();
        creditModifierMap.put("dbCustomerId", customerId);
        return jdbcTemplate.queryForObject(sql, creditModifierMap, Double.class);
    }
}
