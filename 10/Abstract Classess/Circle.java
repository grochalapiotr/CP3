public class Circle extends Shape
{
    private double r;
    public Circle(double r){
        this.r=r;
    }
   public double area(){
    return 3.14*r*r;
    }
    public double perimiter(){
        return 2*3.14*r;
    }
}
