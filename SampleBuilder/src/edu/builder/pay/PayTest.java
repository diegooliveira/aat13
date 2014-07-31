
package edu.builder.pay;

public class PayTest {
    
    public static void main(String[] args) {
        
        SellerBuilder joaoBuilder = Sellers.registered()
                .withEmal("sample@sample.com");
        
        TransactionBuilder t1 = Transactions.checkout()
                .with(Payments.creditCard())
                .with(joaoBuilder);
        
        TransactionBuilder t2 = Transactions.donation()
                .with(Payments.tef())
                .with(joaoBuilder);
    }
    
}
