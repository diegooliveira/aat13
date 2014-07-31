
package edu.strategy;


public class DiscountByValue implements DiscountStrategy{
    private final double trashold;
    private final double percent;

    public DiscountByValue(double trashold, double percent) {
        this.trashold = trashold;
        this.percent = percent;
    }
    
    @Override
    public double getDiscount(Order orther) {
        if (orther.getTotal() >= trashold)
            return orther.getTotal() * percent;
        return 0;
    }
    
}
