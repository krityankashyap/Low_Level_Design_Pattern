package StrategyPattern;

public class VisaCreditCard extends CreditCard {
  private String CardNumber;
  private String CardHolder;
  private String ExpiryDate;
  private String CVV;

  private RefundStrategy refundStrategy;

  public VisaCreditCard() {
    this.refundStrategy = new BankAccountRefundStrategy();
  }

  @Override
  public void swipeAndPay() {
    // Implementation for swipe and pay
    System.out.println("Swiping Visa Credit Card for payment.");
  }

  @Override
  public void doRefund() {
    // Implementation for refund
    this.refundStrategy.doRefund();
  }

  @Override
  public void onlinePayment() {
    // Implementation for online payment
    System.out.println("Processing online payment with Visa Credit Card.");
  }


}
