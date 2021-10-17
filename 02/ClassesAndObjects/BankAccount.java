public class BankAccount
{
    int number;
    float balance;
    String currency;
    String userName;
    
    void transfer(){
        System.out.println("Making transfer...");
    }
    
    void displayNumber(){
        System.out.println("Your account number is: "+ number);
    }
    
    void chackBalance(){
        System.out.println(balance+currency);
    }
}
