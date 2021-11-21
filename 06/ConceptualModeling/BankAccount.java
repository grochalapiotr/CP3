public class BankAccount
{
    private String number;
    private String owner;
    private int balance;
    private String bankName;
    BankAccount(String number, String owner, int balance, String bankName){
        this.number = number;
        this.owner=owner;
        this.balance=balance;
        this.bankName=bankName;
    }
    
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        if(amount<balance){
            if(amount<=500){
                balance -= amount;
            }
            else{
                System.out.println("Too high withdrawal");
            }
        }
        else{
            System.out.println("Inssuficient funds");
        }
        
        }
    
    
    public String toString(){
     return getOwner()+" has: " + getBalance() + " on his account." ;
    }
    
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
    
    public static void main(String[] args){
        BankAccount account = new BankAccount("0321038234", "Piotr Grochala", 0, "Mbank");
        System.out.println(account);
        account.deposit(500);
        System.out.println(account);
        account.deposit(200);
        System.out.println(account);
        account.withdraw(300);
        System.out.println(account);
    }
}
