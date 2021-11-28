public class Writer
{
    String name;
    String surname;
    int age;
    String gender;
    
    public Writer(String name, String surname, int age, String gender)
    {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.gender=gender;
    }

    public void writeBook(){
        System.out.println("Writing a book");
    }
    public String toString(){
        return "Writer name: "+name+" "+surname+", gender: "+gender+", age: "+age;
    }
}
