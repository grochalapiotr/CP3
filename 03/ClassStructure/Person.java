public class Person
{
    String name;
    float weight;
    float height;
    float BMI;
    
    Person(String name){
        this.name = name;
    }
    Person(String name, float weight, float height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    void setWeightAndHeight(float weight, float height){
        this.weight = weight;
        this.height = height;
    }
    
    void calculateBMI(){
        BMI = weight/(height*height)*10000;
        System.out.println(weight/(height*height)*10000);
    }
    void displayRecord(){
        System.out.println("Name: "+name+
        "\nWeight: "+weight+
        "\nHeight: "+height);
        if (BMI < 18.5) {
            System.out.println("Your BMI is too low");
        } else if (BMI > 24.9){
            System.out.println("Your BMI is too high");
        } else {
            System.out.println("Your BMI is good");
        }
    }
}


