public class Truck extends Vehicle
{
    public Truck(String engine, int vMax, String brand, String model){
        super(engine, vMax, brand, model);
    }
    public void useHorn(){
        System.out.println("BEEP");
    }
}
