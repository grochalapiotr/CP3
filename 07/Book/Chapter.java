public class Chapter
{
    String title;
    int pages;
    int startingPage;
    
    public Chapter(String title, int pages, int startingPage){
        this.title=title;
        this.pages=pages;
        this.startingPage=startingPage;
    }
    public String toString(){
        return "Chapter title: "+title+", pages: "+pages+", starting page: "+startingPage;
    }
}
