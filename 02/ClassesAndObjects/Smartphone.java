public class Smartphone
{
    int number;
    String brand;
    String model;
    float storage;
    boolean unlocked = false;
    
    void showNumber(){
        System.out.println(number);
    }
    
    void unlock(){
        unlocked = !unlocked;
    }
    
    void call(){
        System.out.println("Calling...");
    }
}
