
package edu.builder.pay;


public interface TransactionBuilder {
    
    TransactionBuilder with(PaymentBuilder paymentBuilder);
    TransactionBuilder with(SellerBuilder sellerBuilder);
    
}
