public class Product
{
    private String name;
    private String category;
    private int price;
    

    public Product(String name, String category, int price){
        this.name=name;
        this.category=category;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    
    public void displayInfo(){
        System.out.println("Name: "+getName()+"\nCategory: "+getCategory()+"\nPrice: "+getPrice());
    }
}
