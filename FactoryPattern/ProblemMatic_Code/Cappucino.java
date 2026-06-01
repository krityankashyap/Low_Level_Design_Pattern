package FactoryPattern.ProblemMatic_Code;

public class Cappucino implements Coffee{
  
  @Override
  public void hotDrink() {
    System.out.println("Cappucino is a hot drink");
  }

  @Override
  public void coldDrink() {
    System.out.println("Cappucino is not a cold drink");
  }

  @Override
  public void brew() {
    System.out.println("Brewing Cappucino");
  }
}
