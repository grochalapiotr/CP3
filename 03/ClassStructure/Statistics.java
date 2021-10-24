public class Statistics
{
    int x;
    int y;
    int amount;
    int sum;
    double mean;
    
    
    void Amount(){
        amount = y-x;
        System.out.println("There are "+(y-x)+" items in range"+"<"+x+","+y+">");
    }
    void Sum(){
        sum = 0;
        for(int i=x; i<=y; i++){
            sum = sum + i;
            System.out.println("The total sum is "+sum);
        }
    }
    void Mean(){
        mean = sum/amount;
    }
}
