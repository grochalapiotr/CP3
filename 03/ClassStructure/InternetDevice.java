public class InternetDevice
{
    String name;
    boolean connected;
    static int connectedDevices;
    
    InternetDevice(String name){
        this.name=name;
    }
    
    void Connect(){
        connected = true;
        connectedDevices++;
    }
    void Disconnect(){
        connected = false;
        connectedDevices--;
    }
    
    void isConnected(){
        System.out.println("Device is connected:"+connected);
    }
    
    void displayStatus(){
        System.out.println("Name: "+name+
        "\nConnected: "+connected);
    }
    
    static void displayConnections(){
        System.out.println("There are " + connectedDevices + " connected devices");
    }
}
