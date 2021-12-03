public class Book
{
    private String title;
    private Writer author;
    private Publisher publisher;
    private int year;
    
    public Book(String title, Writer author, Publisher publisher, int year){
        this.title=title;
        this.author=author;
        this.publisher = publisher;
        this.year = year;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(Writer author){
        this.author=author;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author.getFirstName()+" "+author.getLastName();
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        return "Title: "+title+"\nAuthor: "+author;
    }
    public String getPublisher(){
        return publisher.getName();
    }
    public void display(){
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPublisher: "+publisher.getName());
    }
}
