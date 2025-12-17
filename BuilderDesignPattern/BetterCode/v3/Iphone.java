package BuilderDesignPattern.BetterCode.v3;

public class Iphone {
  public static void main(String[] args) {
   ProductClass p = ProductClass.getBuilder()
                                .setName("Iphone")
                                .setPrice(10000)
                                .setBrand("Apple")
                                .setCategory("Mobiles")
                                .setDescription("Phone by Apple")
                                .build();
}
}