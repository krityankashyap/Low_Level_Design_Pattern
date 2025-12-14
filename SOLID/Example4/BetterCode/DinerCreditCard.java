package SOLID.Example4.BetterCode;

public class DinerCreditCard extends CreditCard implements tapAndPayCompatibleCard{

  private String CardNumber;
  private String CardHolder;
  private String ExpiryDate;
  private String CVV;

  @Override
  public void swipeAndPay() {
    // Implementation for swipe and pay
    System.out.println("Swiping Diner Credit Card for payment.");
  }

  @Override
  public void doRefund() {
    // Implementation for refund
    System.out.println("Processing refund on Diner Credit Card.");
  }

  @Override
  public void onlinePayment() {
    // Implementation for online payment
    System.out.println("Processing online payment with Diner Credit Card.");
  }

  @Override
  public void tapAndPay() {
    // Implementation for tap and pay
    System.out.println("Tapping Diner Credit Card for payment.");
  }

}
