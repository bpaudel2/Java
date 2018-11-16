import java.io.*;
public class InstanceVariable{

    /*Instance variables are created when object is created with the use of
    * keyword new
    * Instance variable can be declared in class level before or after use.
    * Access modifiers can be given to instance variable.
    * Instance variables have default value
    */
    //public instance variable is visible for any child class.
    public String name;
    //this instance variable is visible in InstanceVariable class only.
    private double value;
    //The name is assignment in the constructor
    public InstanceVariable(String name){
        this.name = name;
    }
    //The value variable is assigned a value
    public void setValue(double value){
        this.value = value;
    }
    public void printInstanceVariable(){
        System.out.println("Name "+name);
        System.out.println("Value "+value);

    }
    public static void main(String args[]){
        InstanceVariable v1 = new InstanceVariable("First Variable");
        v1.setValue(200);
        v1.printInstanceVariable();
    }
}