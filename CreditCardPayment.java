package payment;


public class CreditCardPayment implements PaymentStrategy{

    public static String cardNumber;
    public static String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName){
        CreditCardPayment.cardNumber = cardNumber;
        CreditCardPayment.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount){
        System.out.println("Your payment Strategy is : " + getPaymentDetails() + " and The amount you are going to pay is : " + amount);
    }
    @Override
    public String getPaymentDetails() {
        return "Credit Card Payment for Card Holder: " + cardHolderName + ", Card Number: " + cardNumber ;
    }
}
