package SOLID.Example4.BetterCode;

public abstract class CreditCard {
  private String cardNumber;
  private String cardHolder;
  private String expiryDate;
  private String CVV;

  // Getters and Setters

  public abstract void swipeAndPay();
  public abstract void doRefund();
  public abstract void onlinePayment();
  
}