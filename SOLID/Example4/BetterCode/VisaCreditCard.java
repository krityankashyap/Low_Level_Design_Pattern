package SOLID.Example4.BetterCode;

public class VisaCreditCard extends CreditCard {
  private String CardNumber;
  private String CardHolder;
  private String ExpiryDate;
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

  
}
