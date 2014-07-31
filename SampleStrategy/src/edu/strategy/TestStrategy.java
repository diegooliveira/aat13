package edu.strategy;

public class TestStrategy {

    @GoodCodeSample(value = CodeCategory.CONTROLLER, comment = "Esta bom por causa")
    public static void main(String[] args) {

        DiscountByItemCount discCount = new DiscountByItemCount(5, 0.05);
        DiscountByValue discByValue = new DiscountByValue(100, 0.1);
        AcumulatedDiscountStrategy acumulated = new AcumulatedDiscountStrategy(2, discCount, discByValue);

        Order order = new Order(100, 7);
        order.setDiscountStrategy(acumulated);
        double totWithDesc = order.getTotalComDesconto();
        System.out.println(totWithDesc);

    }

}
