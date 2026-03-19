package StrategyPattern;

public class RupayCreditCard extends CreditCard implements UpiCompatibleCreditCard, RefundStrategy{
  private String CardNumber;
  private String CardHolder;
  private String ExpiryDate;
  private String CVV;

  private RefundStrategy refundStrategy;

  public RupayCreditCard() {
    this.refundStrategy = new SameInstrumentRefundStrategy();
  }

  @Override
  public void swipeAndPay() {
    // Implementation for swipe and pay
    System.out.println("Swiping Rupay Credit Card for payment.");
  }

  @Override
  public void doRefund() {
    // Implementation for refund
    
    this.refundStrategy.doRefund();
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
