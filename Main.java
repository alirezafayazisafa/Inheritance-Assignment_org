import payment.*;

public class Main {
    public static void main(String[] args) {

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567812345678", "");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        PaymentStrategy payPalPayment = new PayPalPayment("fayazisafaalireza.aut@gmail.com");

        Customer premiumCustomer2 = new PremiumCustomer("Behnam YousefiMehr");
        Customer regularCustomer1 = new RegularCustomer("Alireza FayaziSafa");
        Customer premiumCustomer1 = new PremiumCustomer("Exercise Corrector");

        premiumCustomer1.makePayment(creditCardPayment, 999999999);
        premiumCustomer1.makePayment(bitcoinPayment,900000000);

        regularCustomer1.makePayment(creditCardPayment, 1000);
        regularCustomer1.makePayment(payPalPayment, 2000);

        premiumCustomer2.makePayment(payPalPayment, 800000000);
        premiumCustomer2.makePayment(bitcoinPayment, 700000000);

        regularCustomer1.displayCustomerInfo();
        regularCustomer1.showPaymentHistory();
        premiumCustomer1.displayCustomerInfo();
        premiumCustomer1.showPaymentHistory();
        premiumCustomer2.displayCustomerInfo();
        premiumCustomer2.showPaymentHistory();
    }
}