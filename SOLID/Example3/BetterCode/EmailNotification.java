package SOLID.Example3.BetterCode;

public class EmailNotification implements Notification{
  @Override
  public void sendNotification(String message){
    
    System.out.println("Email notification "+ message);
  }
}
