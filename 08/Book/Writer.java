public class Writer
{
    private String firstName;
    private String lastName;
    private String literaryGenre;
    
    public Writer(String firstName, String lastName, String literaryGenre){
        this.firstName=firstName;
        this.lastName=lastName;
        this.literaryGenre=literaryGenre;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setLiteraryGenre(String literaryGenre){
        this.literaryGenre=literaryGenre;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getLiteraryGenre(){
        return literaryGenre;
    }
    public String toString(){
        return "First name: "+firstName+"\nLast name: "+lastName+"\nLiterary genre: "+literaryGenre;
    }
}
