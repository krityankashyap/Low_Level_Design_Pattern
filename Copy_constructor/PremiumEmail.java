package Copy_constructor;

public class PremiumEmail extends Email {

  private String cc;
  private String bcc;

  PremiumEmail(String sender, String recipient, String subject, String body, String cc, String bcc){
    super(sender, recipient, subject, body);
    this.cc = cc;
    this.bcc = bcc;
  }

  // Copy Constructor
  PremiumEmail(PremiumEmail email){
    super(email);
    this.cc = email.cc;
    this.bcc = email.bcc;
  }

  @Override
  public PremiumEmail copy(){
    return new PremiumEmail(this); // this is calling the copy constructor
  }

  // Getters and Setters

  public String getCc(){
    return cc;
  }
  
  public void setCc(String cc){
    this.cc = cc;
  }

  public String getBcc(){
    return bcc;
  }

  public void setBcc(String bcc){
    this.bcc = bcc;
  }


}
