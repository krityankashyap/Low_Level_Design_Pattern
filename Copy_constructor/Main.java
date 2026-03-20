package Copy_constructor;

public class Main {
  
  public static void main(String[] args) {
    Email e1 = new Email("hello@gmail.com", "", "Test email", "this is a test email");

    // Using copy constructor to create a new email object
    Email e2= new Email(e1);  // this is calling the copy constructor
    
    e2.displayEmail();

    PremiumEmail pe= new PremiumEmail("hello@gmail.com", "", "Test email", "this is a test email", "cc", "bcc");

    PremiumEmail pe2= pe.copy(); // this is calling the copy method which internally calls the copy constructor
  }
}
