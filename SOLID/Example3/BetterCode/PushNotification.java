package SOLID.Example3.BetterCode;

public class PushNotification implements Notification{

  @Override
  public void sendNotification(String message){
    System.out.println("Push notification "+ message);
  }
}
