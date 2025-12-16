package BuilderDesignPattern.BetterCode.v2;

public class Iphone {
  public static void main(String[] args) {
    Builder iphoneBuilder = new Builder();

    iphoneBuilder.setName("Iphone 14 Pro Max");
    iphoneBuilder.setPrice(1299.99);
    iphoneBuilder.setDescription("The latest iPhone with advanced features and improved performance.");
    iphoneBuilder.setCategory("Electronics");
    // Set other properties as needed

    ProductClass iphone14ProMax = new ProductClass(iphoneBuilder);
  }
}
