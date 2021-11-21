public class MobilePhone
{
    private String number;
    private String brand;
    private String model;
    private float storage;
    
    public MobilePhone(String number, String brand, String model, float storage){
    this.number = number;
    this.brand=brand;
    this.model=model;
    this.storage=storage;
    }
    
    public void call(int callNumber){
        System.out.println("You're calling: "+callNumber);
        
    }
    public void displayNumber(){
        System.out.println("Phone number: "+number);
    }
    public String getNumber(){
        return number;
    }
    public String getBrand(){
     return brand;
    }
    public String getModel(){
        return model;
    }
    public float getStorage(){
        return storage;
    }
    public String toString(){
         return getBrand()+" "+getModel()+" "+getStorage()+"GB";
    }
    public void installApp(String name){
        System.out.println("Installing... "+name);
    }
}
