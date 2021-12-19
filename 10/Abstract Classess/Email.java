public class Email extends Message
{
    private String messageSubject;
    private String recipentAddress;
    public String senderAddress;
    public Email(String txt, String msg, String ra, User user){
        super(txt);
        messageSubject=msg;
        recipentAddress=ra;
        senderAddress=user.email;
    }
    public void setMessageSubject(String msg){
        messageSubject=msg;
    }
    public void setRecipentAddress(String ra){
        recipentAddress=ra;
    }
    public String getMessageSubject(){
        return messageSubject;
    }
    public String getRecipentAddress(){
        return recipentAddress;
    }
    public void send(){
        System.out.println(getText());
    }
}
