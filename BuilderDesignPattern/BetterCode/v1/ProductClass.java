package BuilderDesignPattern.BetterCode.v1;

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

  ProductClass() {}

   public void setName(String name) {
    this.name = name;
   }

    public void setPrice(double price) {
      this.price = price;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public void setCategory(String category) {
      this.category = category;
    }

    
}
  


