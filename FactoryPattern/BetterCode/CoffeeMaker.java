package FactoryPattern.BetterCode;

public class CoffeeMaker {
  
  public Coffee makeCoffee(String whichCoffee){
    Coffee coffee= Factory.getCoffee(whichCoffee);

    return coffee;
  }

}
