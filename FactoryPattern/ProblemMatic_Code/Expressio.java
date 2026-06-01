package FactoryPattern.ProblemMatic_Code;

public class Expressio implements Coffee {

  @Override
  public void hotDrink() {
    System.out.println("Expressio is a hot drink");
  }

  @Override
  public void coldDrink() {
    System.out.println("Expressio is not a cold drink");
  }

  @Override
  public void brew() {
    System.out.println("Brewing Expressio");
  }
  
}
