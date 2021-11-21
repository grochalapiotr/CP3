public class ComputerFile
{
    int size;
    String name;
    String extension;
    
    public ComputerFile(int size, String name, String extension){
        this.size = size;
        this.name=name;
        this.extension=extension;
    }
    
    int whatSize(){
        return size;
    }
    String fileName(){
        return name+'.'+extension;
    }
}
