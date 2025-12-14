package StrategyPattern;

public class BankAccountRefundStrategy implements RefundStrategy {

    @Override
    public void doRefund() {
        System.out.println("Processing refund to the bank account.");
    }
  
}
