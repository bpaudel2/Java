public class StringClassTest {
   /*String class has about 11 Constructors.
   The String class is immutable, so that once it is created 
   a String object cannot be changed. If there is a necessity to make a lot of 
   modifications to Strings of characters, then you should use String 
   Buffer & String Builder Classes.
   */
   public static void main(String args[]) {
      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
      String helloString = new String(helloArray);  
      System.out.println( helloString );
      System.out.println("The length of String is "+helloString.length());
   }
}