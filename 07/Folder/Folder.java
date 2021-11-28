import java.util.ArrayList;
public class Folder
{
    ArrayList<File> files = new ArrayList<File>();
    String name;
    String path;

    public Folder(String name, String path){
        this.name=name;
        this.path=path;
    }
    public String toString(){
        return "Folder name: "+name+", path: "+path;
    }
    public void showContent(){
    System.out.println(files);
    }
    public void addFile(String name, double size){
        File file = new File(name, size);
        files.add(file);
    }
    public void deleteFile(int index){
        files.remove(index);
    }
}
