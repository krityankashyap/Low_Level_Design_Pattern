package SOLID.Example4.ProblemeticCode;

public class AmexCreditCard extends CreditCard {
  private String cardNumber;
  private String cardHolder;
  private String expiryDate;
  private String CVV;

  @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
        System.out.println("Swiping Amex Credit Card for payment.");
    }

    @Override
    public void doRefund() {
        // Implementation for refund
        System.out.println("Processing refund on Amex Credit Card.");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
        System.out.println("Processing online payment with Amex Credit Card.");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
        System.out.println("Tapping Amex Credit Card for payment.");
    }

    // @Override
    // public void upiPayment() {
    //     // Implementation for UPI payment
    //     System.out.println("Processing UPI payment with Amex Credit Card.");
    //}

    @Override
    public void intlPayment(){
        // Implementation for international payment
        System.out.println("Processing international payment with Amex Credit Card.");
    }
  
}
