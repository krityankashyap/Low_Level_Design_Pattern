package BuilderDesignPattern.ProblematicCode;

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

  ProductClass(String name, double price, String description, String category, String brand, int discount,
      String createdAt, String updatedAt, List<String> imgages) {
    this.name = name;
    this.price = price;
    this.description = description;
    this.category = category;
    this.brand = brand;
    this.discount = discount;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.imgages = imgages;
  }

  ProductClass(String name, double price, String description) {
    this.name = name;
    this.price = price;
    this.description = description;
   }

   ProductClass(String name, double price) {
    this.name = name;
    this.price = price;
   }
}
  

