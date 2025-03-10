package payment;

public class PayPalPayment implements PaymentStrategy{

    public static String Email;

    public PayPalPayment(String Email){
        PayPalPayment.Email = Email;
    }

    public void pay(double amount){
        System.out.println("Your payment Strategy is : " + getPaymentDetails() + " and The amount you are going to pay is : " + amount);
    }
    public String getPaymentDetails(){

        return "PayPal Payment for Email" + Email ;
    }

}
