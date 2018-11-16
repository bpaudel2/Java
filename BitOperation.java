public class BitOperation{
    public static void main(String args[]){
        int a = 60;
        int b= 13;
        System.out.println("Bitwise and between "+a+" and "+b+" is " +(a&b));
        System.out.println("Bitwise or between "+a+" and "+b+" is " +(a|b));
        System.out.println("Bitwise XOR between "+a+" and "+b+" is " +(a^b));
        System.out.println("Bitwise compliment between of "+a+" is " +(~a));
        System.out.println("Binary left shift operator on "+a+" with 2 "+" is " +(a<<2));
        System.out.println("Binary right shift operator on "+a+" and with 2 is " +(a>>2));
        System.out.println("Zero fill right shift on "+a+" with 2 is " +(a>>>2));
       
        
    }
}