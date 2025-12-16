package BuilderDesignPattern.ProblematicCode;

import java.util.List;

public class Iphone {
  public static void main(String[] args) {
    ProductClass iphone14ProMax = new ProductClass(
        "Iphone 14 Pro Max",
        1299.99,
        "The latest iPhone with advanced features and improved performance.",
        "Electronics",
        "Apple",
        10,
        "2023-09-14",
        "2023-09-14",
        List.of("image1.jpg", "image2.jpg"));
  }

  
}
