public class Book
{
    String author;
    String title;
    int pages;
    String genre;
    boolean isOpened=false;
    
    public Book(String author, String title, int pages, String genre){
        this.author=author;
        this.title=title;
        this.pages=pages;
        this.genre=genre;
    }
    void openBook(){
        isOpened=true;
    }
    void closeBook(){
        isOpened=false;
    }
    void read(){
        if(isOpened){
            System.out.println("You're reading");
        }else{
            System.out.println("You have to open the book");
        }
    }
    public String toString(){
        return "Title: "+title+"\nAuthor: "+author+"\nPages: "+pages+"\nGenre: "+genre;
    }
}
