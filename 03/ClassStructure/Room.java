public class Room
{
    int number;
    int beds;
    boolean occupied;
    String guestName;
    static Room[] rooms = new Room[6];
    
    Room(int number){
    this.number = number;
    beds = 2;
    }
    
    Room(int number, int beds){
    this.number=number;
    this.beds=beds;
    }
    
    void checkin(String guestName){
        this.guestName=guestName;
    }
    void checkout(){
        guestName=null;
    }
    void isOccupied(){
        occupied =! occupied;
    }
    public String toString(){
    return ("Number: "+number+
    "\nBeds: "+beds+
    "\nGuest Name: "+guestName);
    }
}
