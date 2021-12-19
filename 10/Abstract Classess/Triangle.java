public class Triangle extends Shape
{
    private double a;
    private double h;
    private double b;
    private double c;
    public Triangle(double a, double h, double b, double c){
        this.a=a;
        this.h=h;
        this.b=b;
        this.c=c;
    }
   public double area(){
    return a*h*0.5;
    }
    public double perimiter(){
        return a+b+c;
    }
}