package payment;

public class RegularCustomer extends Customer{

    public RegularCustomer(String CustomerName){
        super(CustomerName);
    }


    public void displayCustomerInfo() {
        System.out.println("your Name is :" + getCustomerName() +" you are Known as Regular Customer");
    }

}
