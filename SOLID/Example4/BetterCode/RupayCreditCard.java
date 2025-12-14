package SOLID.Example4.BetterCode;

public class RupayCreditCard extends CreditCard implements UpiCompatibleCreditCard{
  private String CardNumber;
  private String CardHolder;
  private String ExpiryDate;
  private String CVV;

  @Override
  public void swipeAndPay() {
    // Implementation for swipe and pay
    System.out.println("Swiping Rupay Credit Card for payment.");
  }

  @Override
  public void doRefund() {
    // Implementation for refund
    System.out.println("Processing refund on Rupay Credit Card.");
  }

  @Override
  public void onlinePayment() {
    // Implementation for online payment
    System.out.println("Processing online payment with Rupay Credit Card.");
  }

  @Override
  public void upiPayment() {
    // Implementation for UPI payment
    System.out.println("Processing UPI payment with Rupay Credit Card.");
  }
  
}
