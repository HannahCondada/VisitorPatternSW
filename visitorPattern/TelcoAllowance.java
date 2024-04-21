package visitorPattern;
import java.util.*;

public class TelcoAllowance implements UsagePromo {

    private static final Map<String, Double> telcoAllowanceMap = new HashMap<>();

    static {
        telcoAllowanceMap.put("Smart", 15.0);
        telcoAllowanceMap.put("Globe", 10.0);
        telcoAllowanceMap.put("Ditto", 8.0);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        double allowance = telcoAllowanceMap.getOrDefault(telcoName, 0.0);
        return " Offers a data allowance of " + allowance + " GB for ₱" + money + " per month.";
    }
}
