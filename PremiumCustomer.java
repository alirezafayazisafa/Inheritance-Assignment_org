package payment;

public class PremiumCustomer extends Customer{

    public PremiumCustomer(String CustomerName){
        super(CustomerName);
    }


    public void displayCustomerInfo() {
        System.out.println("your Name is :" + getCustomerName() +" you are Known as premium Customer");
    }

}
