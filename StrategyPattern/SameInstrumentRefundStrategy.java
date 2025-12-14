package StrategyPattern;

public class SameInstrumentRefundStrategy implements RefundStrategy {

  @Override
  public void doRefund() {
    System.out.println("Processing refund to the same instrument used for payment.");
  }
}