public class SMS extends Message
{
   private String phoneNumber;
   public SMS(String txt, User user){
    super(txt);
    phoneNumber=user.phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void send(){
        System.out.println("To: "+getPhoneNumber()+"\n"+getText());
    }
}
