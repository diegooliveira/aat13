

package edu.strategy;


public class DiscountByItemCount implements DiscountStrategy {
    private final int qtdMin;
    private final double percent;

    public DiscountByItemCount(int qtdMin, double percent) {
        this.qtdMin = qtdMin;
        this.percent = percent;
    }
    
    @Override
    public double getDiscount(Order orther) {
        if (orther.getItemCount() >= qtdMin)
            return orther.getTotal() * percent;
        return 0;
    }
    
}
