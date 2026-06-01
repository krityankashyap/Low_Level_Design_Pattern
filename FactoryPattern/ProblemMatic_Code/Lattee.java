package FactoryPattern.ProblemMatic_Code;

public class Lattee  implements Coffee {

  @Override
  public void hotDrink() {
    System.out.println("Lattee is a hot drink");
  }

  @Override
  public void coldDrink() {
    System.out.println("Lattee is not a cold drink");
  }

  @Override
  public void brew() {
    System.out.println("Brewing Lattee");
  }
  
}
