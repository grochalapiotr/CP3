import java.util.ArrayList;
public class Book
{
    String title;
    Writer writer;
    int pages;
    int price;
    ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    public Book(String title, Writer writer, int pages, int price)
    {
        this.title=title;
        this.writer=writer;
        this.pages=pages;
        this.price=price;
    }

    public void open(){
        System.out.println("Opening book...");
    }
    public void close(){
        System.out.println("Closing book...");
    }
    public void addChapter(String title, int pages, int startingPage){
        Chapter chapter = new Chapter(title, pages, startingPage);
        chapters.add(chapter);
    }
    public String toString(){
        return "Book title: "+title+", pages: "+pages+", price: "+price;
    }
    public void showChapters(){
        System.out.println(chapters);
    }
}
