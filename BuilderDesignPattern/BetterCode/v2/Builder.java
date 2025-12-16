package BuilderDesignPattern.BetterCode.v2;

import java.util.List;

public class Builder {
  private String name;
  private double price;
  private String description;
  private String category;
  private String brand;
  private int discount;
  private String createdAt;
  private String updatedAt;

  private List<String> imgages;

  Builder() {}

   public void setName(String name) {
    this.name = name;
   }

   public String getName(){
    return this.name;
   }

    public void setPrice(double price) {
      if(price < 0) return;
      this.price = price;
   }

   public double getPrice(){
    return this.price;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public void setCategory(String category) {
      this.category = category;
    }

    
}
