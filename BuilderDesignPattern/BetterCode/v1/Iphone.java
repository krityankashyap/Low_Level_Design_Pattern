package BuilderDesignPattern.BetterCode.v1;

public class Iphone {
  public static void main(String[] args) {
    ProductClass p= new ProductClass(); // Now thats a new plan object becoz we haven't set any properties yet

    p.setName("Iphone");
    p.setPrice(1299.99);
    p.setDescription("The latest iPhone with advanced features and improved performance.");
    
  }
}
