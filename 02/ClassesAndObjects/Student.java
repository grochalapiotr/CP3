public class Student
{
  String name;
  int age;
  String studentID;
  boolean isValid;
  int semesterNumber;
  float avgGrade;
  
  
  
  void sayHello(){
    System.out.println("Hello");
    }
    
  void displayName(){
    System.out.println(name);
    }
    
  void displayAge(){
    System.out.println(age);
    }
  void displayStudent(){
    System.out.println(name + semesterNumber + avgGrade);
    }
  void changeValid(){
    isValid=!isValid;
    }
  void displayStudentCard(){
    System.out.println(name + studentID + isValid);
    }
}
