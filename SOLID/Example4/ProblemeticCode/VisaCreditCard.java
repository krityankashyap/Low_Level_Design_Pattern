package SOLID.Example4.ProblemeticCode;

public class VisaCreditCard extends CreditCard {
  
  private String cardNumber;
  private String cardHolder;
  private String expiryDate;
  private String CVV;

  @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
        System.out.println("Swiping Visa Credit Card for payment.");
    }

    @Override
    public void doRefund() {
        // Implementation for refund
        System.out.println("Processing refund on Visa Credit Card.");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
        System.out.println("Processing online payment with Visa Credit Card.");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
        System.out.println("Tapping Visa Credit Card for payment.");
    }

    // @Override
    // public void upiPayment() {
    //     // Implementation for UPI payment
    //     System.out.println("Processing UPI payment with Visa Credit Card.");
    // }

    @Override
    public void intlPayment(){
        // Implementation for international payment
        System.out.println("Processing international payment with Visa Credit Card.");
    }
}
