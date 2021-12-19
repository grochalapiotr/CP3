public abstract class Message
{
    private String text;
    
    public Message(){
        text = "";
    }
    public Message(String txt){
        text=txt;
    }
    
    public String getText(){
        return text;
    }
    public void setText(String txt){
        text = txt;
    }
    public int charNumber(){
        return text.length();
    }
    public abstract void send();
}
