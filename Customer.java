package payment;

import java.util.ArrayList;

public abstract class Customer {

    private String CustomerName;
    private ArrayList<String> PaymentHistory;

    public Customer(String CustomerName){

        this.CustomerName = CustomerName;
        this.PaymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public  void makePayment(PaymentStrategy paymentStrategy, double amount){

        paymentStrategy.pay(amount);
        PaymentHistory.add(paymentStrategy.getPaymentDetails() + " - Amount: " + amount);

    }

    public void showPaymentHistory(){
        System.out.println("Payment History for " + CustomerName + ":");
        for (String payment : PaymentHistory) {
            System.out.println(payment);
        }
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public ArrayList<String> getPaymentHistory() {
        return PaymentHistory;
    }
}

