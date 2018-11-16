import java.io.*;
public class StaticVariable{
    /*There would only be one copy of static variable per class regardless
    * of number of objects created from that class. Static variables are used
    * mostly to declare constant which never change its value
    *
    */

    //We're making name constant here so it is in all CAPITAL
    public static final String name ="Static Variable";
    private static double value;
    public static void main(String args[]){
        value=100;
        System.out.println(name +" : "+value);
    }
}