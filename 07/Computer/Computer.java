public class Computer
{
    public String GPU;
    public int RAM;
    public String motherboard;
    public boolean isOn=false;
    public Processor processor;
    
    public Computer(String GPU, int RAM, String motherboard){
        this.GPU = GPU;
        this.RAM = RAM;
        this.motherboard = motherboard;
        processor = new Processor("Intel","12032K","LGA-1234","3GHz",8);
    }
    
    void turnOn(){
        isOn = true;
        System.out.println("Turning on..");
    }
    void turnOff(){
        isOn = false;
        System.out.println("Turning off...");
    }
    void restart(){
        System.out.println("Restarting...");
    }
    void sleepMode(){
        System.out.println("Entering sleep mode...");
    }
    public String showSpecification(){
            return "GPU: "+GPU+"\nRAM: "+RAM+"\nMotherboard: "+motherboard;
        }
}
