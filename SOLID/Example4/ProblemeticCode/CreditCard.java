package SOLID.Example4.ProblemeticCode;

public abstract class CreditCard {
  private String cardNumber;
  private String cardHolder;
  private String expiryDate;
  private String CVV;

  // Getters and Setters

  public abstract void swipeAndPay();
  public abstract void doRefund();
  public abstract void onlinePayment();
  public abstract void tapAndPay();
  // public abstract void upiPayment();
  public abstract void intlPayment();


}
