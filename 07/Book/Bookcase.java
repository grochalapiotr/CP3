import java.util.ArrayList;
public class Bookcase
{
    ArrayList<Book> books = new ArrayList<Book>();
    public void addBook(Book book){
        books.add(book);
    } 
    public void showBooks(){
        System.out.println(books);
    }
}
