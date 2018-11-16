import java.io.*;
public class Main{
    public static void main(String args[]){
        Person person1 = new Person("John Doe");
        Person person2 = new Person("Ram Bahadur");
        
        person1.setAge(25);
        person2.setAge(16);
        person1.setPosition("Software Developer");
        person2.setPosition("Database Admin");
        person1.setSalary(20000);
        person2.setSalary(35000);
        person1.printPerson();
        person2.printPerson();
    }
}