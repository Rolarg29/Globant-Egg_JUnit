package Services;

import Entities.DiscountCalculator;

public class DiscountCalculatorService {

    public double calculateDiscount(DiscountCalculator c){
        double discount = c.getRegularPrice()-((c.getRegularPrice()* c.getDiscount())/100);
        c.setDiscountPrice(discount);
        return discount;
    }
}
