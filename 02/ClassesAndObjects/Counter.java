public class Counter
{
    int value = 0;
    
    void increaseOne(){
        value++;
    }
    void decreaseOne(){
        value--;
    }
    void increaseTen(){
        value = value + 10;
    }
    void decreaseTen(){
        value = value - 10;
    }
    void reset(){
        value = 0;
    }
    void info(){
        System.out.println(value);
    }
}
