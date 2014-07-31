package edu.strategy;

public class Order {

    double total;
    int qtdItens;

    public Order(double total, int qtdItens) {
        this.total = total;
        this.qtdItens = qtdItens;
    }

    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getTotal() {
        return total;
    }

    public double getTotalComDesconto() {
        return total - discountStrategy.getDiscount(this);
    }

    int getItemCount() {
        return qtdItens;
    }
}
