public class Customer
{
    private String name;
    private String accountNumber;
    private String product;
    private int balance;
    
    public Customer(String name, String accountNumber, String product, int balance){
        this.name=name;
        this.accountNumber=accountNumber;
        this.product=product;
        this.balance=balance;
    }
    public void chooseProduct(String product){
        this.product=product;
    }
    public void buy(){
        System.out.println("Buying...");
    }
    public String getName(){
        return name;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public void showBalance(){
        System.out.println("Balance: "+getBalance());
    }
    
    public void displayInfo(){
        System.out.println("Name: "+getName()+"\nAccount number: "+getAccountNumber());
    }
}
