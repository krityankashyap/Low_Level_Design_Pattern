package FactoryPattern.BetterCode;

public class Factory {

  Coffee coffee;

  public void getCoffee(String whichCoffee){
    if(whichCoffee.equals("Lattee")){
      coffee= new Lattee();
    } else if(whichCoffee.equals("Cappucino")){
      coffee= new Cappucino();
    } else {
      coffee= new Expressio();
    }
  return coffee;
}
}
