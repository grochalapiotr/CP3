public abstract class Vehicle
{
    public String engine;
    public int vMax;
    public String brand;
    public String model;
    
    public Vehicle(String engine, int vMax, String brand, String model){
        this.engine=engine;
        this.vMax=vMax;
        this.brand=brand;
        this.model=model;
    }
    public void startVehicle(){
        System.out.println("Starting vehicle");
    }
    public abstract void useHorn();
}
