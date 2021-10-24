import java.util.*;
public class StudentGrades { 
    
    String studentName; 
    double[] grades;
    double lowest;
    double highest;
    double amount;
    double average;
    
    StudentGrades(String name, double[] grades) { 
        this.studentName = name; 
        this.grades = grades; 
        }
    
    StudentGrades(String name, int numberOfGrades) { 
        Random rand = new Random();
        numberOfGrades = rand.nextInt(20);
        }
        
    
    StudentGrades(String name) { 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = keyboard.nextLine();
        }
        
    void Lowest(){
        Arrays.sort(grades);
        lowest=grades[0];
        System.out.println("Minimum = " + grades[0]);
        
    }
    void Highest(){
        Arrays.sort(grades);
        highest = grades[grades.length-1];
        System.out.println("Maximum = " + grades[grades.length-1]);
        
    }
    void Amount(){
        amount = grades.length;
        System.out.println("There are "+grades.length+" grades");
    }
    void Average(){
        int sum = 0;
        for (double value : grades){
            sum += value;
        }
        average = sum/grades.length;
    }
    
    void DisplayInfo(){
        System.out.println("Name: "+studentName+
        "\nAmount: "+amount+
        "\nMinimum = " + lowest+
        "\nMaximum = " + highest+
        "\nAverage: " + average+
        "\nGrades: " +grades);
    }
    }