import java.io.*;
public class Person{
    String name;
    int age;
    String position;
    double salary;

    public Person(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPosition(String position){
        this.position = position;
    
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void printPerson(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Position "+position);
        System.out.println("Salary "+salary);
        
    }
}