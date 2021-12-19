public class Bus extends Vehicle
{
    public Bus(String engine, int vMax, String brand, String model){
        super(engine, vMax, brand, model);
    }
    public void useHorn(){
        System.out.println("Beep");
    }
}
