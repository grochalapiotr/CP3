public class CinemaTicket
{
    static String cinemaName = "Multikino";
    String title;
    int row;
    int seat;
    float price;    
    
    public static void main(String[] args) {
        CinemaTicket ticket1 = new CinemaTicket();
        CinemaTicket ticket2 = new CinemaTicket();
        ticket1.title = "Star Wars";
        ticket1.row = 3;
        ticket1.seat = 12;
        //ticket1.price = 12.9f;
        if (ticket1.row <=2) {
            ticket1.price = 10f;
        } else {
            ticket1.price = 25f;
        }
        ticket2.title = "Titanic";
        ticket2.row = 1;
        ticket2.seat = 23;
        //ticket2.price = 10.4f;
        if (ticket2.row <=2) {
            ticket2.price = 10f;
        } else {
            ticket2.price = 25f;
        }
        ticket1.displayInfo();
        ticket2.displayInfo();
        }
        
    void displayInfo(){
        System.out.println("Cinema name: "+CinemaTicket.cinemaName + 
        "\nTitle: "+title+
        "\nRow: "+row+
        "\nSeat: "+seat+
        "\nPrice: "+price);
    }
}
