package BuilderDesignPattern.BetterCode.v2;

import java.util.List;

public class ProductClass {

  private String name;
  private double price;
  private String description;
  private String category;
  private String brand;
  private int discount;
  private String createdAt;
  private String updatedAt;

  private List<String> imgages;

  ProductClass(Builder b) {
    this.name = b.getName();
   if(b.getPrice() >= 0){
    this.price = b.getPrice();
   }
  }

  

    
}
