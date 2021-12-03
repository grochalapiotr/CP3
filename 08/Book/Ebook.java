public class Ebook extends Book
{
    private String fileName;
    public Ebook(String title, Writer author, String fileName, Publisher publisher,int year){
        super(title, author, publisher, year);
        this.fileName=fileName;
    }
    public void setFileName(String fileName){
    this.fileName=fileName;
    }
    public String getFileName(){
        return fileName;
    }
    public String toString(){
        return "Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nFile name: "+getFileName();
    }
    public void display(){
        System.out.println("Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nPublisher: "+getPublisher()+"\nFile name: "+getFileName());
    }
}
