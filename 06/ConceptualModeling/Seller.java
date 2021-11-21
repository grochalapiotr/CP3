public class Seller
{
    private String name;
    private String accountNumber;
    
    public Seller(String name, String accountNumber){
        this.name = name;
        this.accountNumber=accountNumber;
    }
    public void sell(){
        System.out.println("Selling...");
    }
    public String getName(){
        return name;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public void displayInfo(){
        System.out.println("Name: "+getName()+"\nAccount number: "+getAccountNumber());
    }
}
