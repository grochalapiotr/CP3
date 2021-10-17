public class Lamp
{
    boolean isOn = false;
    
    void turnOn(){
        isOn=true;
    }
    void turnOff(){
        isOn=false;
    }
    void status(){
        System.out.println("Lamp is on: " + isOn);
    }
}
