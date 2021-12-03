import java.util.ArrayList;
public class Library
{
    public ArrayList<Book> books=new ArrayList<Book>();
    
    public void addBook(String title, Writer author,Publisher publisher, int year){
        Book book = new Book(title, author, publisher, year);
        books.add(book);
    }
    public void addEbook(String title, Writer author, String fileName, Publisher publisher, int year){
        Book ebook = new Ebook(title, author, fileName, publisher, year);
        books.add(ebook);
    }
    public void addAudiobook(String title, Writer author, int minutes, int seconds, Publisher publisher, int year){
        Book audiobook = new Audiobook(title, author, minutes, seconds, publisher, year);
        books.add(audiobook);
    }
    public void display(){
        System.out.println(books);
    }
    public void display(int index){
        books.get(index).display();
    }
}
