import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingList
{
    ArrayList<String> shopping = new ArrayList<String>();
    
    void addProduct(String product){
        shopping.add(product);
    }
    public String toString(){
        String list="List: ";
        for(int i=0;i<shopping.size();i++){
            list+=shopping.get(i)+", ";
        }
        return list;
    }
    public void amount(){
        System.out.println("Products in cart: "+shopping.size());
    }
    public void writeDown(){
        Scanner product = new Scanner(System.in);
        System.out.println("Enter product: ");
        String newProduct = product.nextLine();
        shopping.add(newProduct);
    }
    public static void main(String[] args){
        ShoppingList sList = new ShoppingList();
        System.out.println(sList);
        sList.amount();
        sList.addProduct("Chleb");
        sList.addProduct("Jajka");
        sList.addProduct("Woda");
        System.out.println(sList);
        sList.amount();
        sList.addProduct("Mięso");
        System.out.println(sList);
        sList.amount();
    }
}
