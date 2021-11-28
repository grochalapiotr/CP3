public class File
{
    String name;
    double size;
    
    public File(String name, double size){
        this.name=name;
        this.size=size;
    }
    public void open(){
        System.out.println("Opening file...");
    }
    public String toString(){
        return "File name: "+name+", size: "+size;
    }
}
