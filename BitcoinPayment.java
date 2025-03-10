package payment;

public class BitcoinPayment implements PaymentStrategy{

    public static String walletAddress;

    public BitcoinPayment(String walletAddress){
        BitcoinPayment.walletAddress = walletAddress;
    }

    public void pay(double amount){

        System.out.println("Your payment Strategy is : " + getPaymentDetails() + " and The amount you are going to pay is : " + amount);
    }
    public String getPaymentDetails(){

        return "Bitcoin Payment for walletAddress" + walletAddress;
    }
}
