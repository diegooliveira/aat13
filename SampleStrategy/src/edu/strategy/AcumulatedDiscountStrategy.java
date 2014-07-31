
package edu.strategy;


public class AcumulatedDiscountStrategy implements DiscountStrategy{
    
    private final int maxAcumulated;
    private final DiscountStrategy[] discounts;

    public AcumulatedDiscountStrategy(int maxAcumulated, DiscountStrategy... discounts) {
        this.maxAcumulated = maxAcumulated;
        this.discounts = discounts;
    }

    @Override
    public double getDiscount(Order orther) {
        double totalDiscount = 0;
        int qtdDiscouts = 0;
        for (DiscountStrategy d : discounts){
            double value = d.getDiscount(orther);
            if (value > 0){
                qtdDiscouts++;
                if (qtdDiscouts > maxAcumulated)
                    break;
                totalDiscount += value;
            }
        }
        return totalDiscount;
    }
    
    
    
}
