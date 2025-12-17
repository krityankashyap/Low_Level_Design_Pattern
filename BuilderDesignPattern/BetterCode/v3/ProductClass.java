package BuilderDesignPattern.BetterCode.v3;

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

  private ProductClass(Builder b) {
    this.name = b.getName();

   if(b.getPrice() >= 0){
    this.price = b.getPrice();
   }

    this.description = b.getDescription();
    this.category = b.getCategory();
    this.brand = b.getBrand();
    this.discount = b.getDiscount();
    this.createdAt = b.getCreatedAt();
    this.updatedAt = b.getUpdatedAt();

  }

  public static Builder getBuilder() {  // static because we don't need an instance of ProductClass to create a Builder
    return new Builder();
  }
  
  public static class Builder {  // static because we want to create Builder without an instance of ProductClass
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
  
     public ProductClass build() {
      return new ProductClass(this);
     }
  
     public Builder setName(String name) {
      this.name = name;
      return this;
     }
  
     public String getName(){
      return this.name;
     }
  
      public Builder setPrice(double price) {
        if(price < 0) return this;
        this.price = price;
        return this;
     }
  
     public double getPrice(){
      return this.price;
      }
  
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }
  
      public String getDescription() {
        return this.description;
      }
  
      public Builder setCategory(String category) {
        this.category = category;
        return this;
      }
  
      public String getCategory() {
        return this.category;
      }
  
      public String getBrand() {
        return this.brand;
      }
  
      public Builder setBrand(String brand) {
        this.brand = brand;
        return this;
      }
  
      public int getDiscount() {
        return this.discount;
      }
  
      public String getCreatedAt() {
        return this.createdAt;
      }
  
      public String getUpdatedAt() {
        return this.updatedAt;
      }
  
      
  }
  
    
}
