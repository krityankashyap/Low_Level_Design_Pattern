package SOLID.Example3.ProblematicCode;

import java.util.List;

public class NotificationSender {
  
  public void sendNotification(List<NotificationType> notificationTypes, String message){
    for(NotificationType notificationType: notificationTypes){
      switch (notificationType) {
        case SMS:
          notificationType.sendSMSnotification(message);
          break;
        
        case email:
        notificationType.sendEmailnotification(message);
        break;

        case PUSH:
        notificationType.sendPushnotification(message);
        break;

        case WHATSAPP:
        notificationType.sendWhatsAppnotification(message);
        break;
      }
    }
  }
}
 