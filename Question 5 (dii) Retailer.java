package adrian.main1;

/**
 *
 * @author ADRIAN M
 */
public class Retailer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.18;
    }
}
    
