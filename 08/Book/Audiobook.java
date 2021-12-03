public class Audiobook extends Book
{
    private int minutes;
    private int seconds;
    public Audiobook(String title, Writer author, int minutes, int seconds, Publisher publisher, int year){
        super(title, author, publisher, year);
        this.minutes=minutes;
        this.seconds=seconds;
    }
    public void setMinutes(int m){
        minutes=m;
    }
    public void setSeconds(int s){
        seconds=s;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public String toString(){
        return "Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nDuration: "+minutes+":"+seconds;
    }
    public void display(){
        System.out.println("Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nPublisher: "+getPublisher()+"\nDuration: "+minutes+":"+seconds);
    }
    
}
