package SOLID.Example3.ProblematicCode;

public enum NotificationType {
  SMS,
  email,
  PUSH,
  WHATSAPP;

  public void sendSMSnotification(String message){
    System.out.println("SMS notification "+ SMS);
  }

  public void sendEmailnotification(String message){
    System.out.println("Email notification "+ email);
  }

  public void sendPushnotification(String message){
    System.out.println("PUSH "+ PUSH);
  }

  public void sendWhatsAppnotification(String message){
    System.out.println("Notification "+ WHATSAPP);
  }
}