package SOLID.Example3.BetterCode;

public class PushNotifications extends Notification{
  
  @Override
   void sendNotification(String message){
      System.out.println("Push notification: " + message);
   }
}
