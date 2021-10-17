public class Book
{
    String name;
    String author;
    int pages;
    int currentPage;
    int year;
    
    void displayBook(){
        System.out.println(name + " " + author + " "+year);
    }
    
    void goToPage(int page){
        currentPage = page;
    }
    
}
