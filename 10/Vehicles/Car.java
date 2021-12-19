public class Car extends Vehicle
{
    public Car(String engine, int vMax, String brand, String model){
        super(engine, vMax, brand, model);
    }
    public void useHorn(){
        System.out.println("beep");
    }
}
