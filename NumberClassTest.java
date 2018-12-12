public class NumberClassTest {

   public static void main(String args[]) {
      /*Number class has methods like xxxValue(), compareTo(), equals()
      * valueOf(), toString(), parseInt() etc.
      */
      Integer x = 5; // boxes int to an Integer object
      x =  x + 10;   // unboxes the Integer to a int
      System.out.println(x); 
      Integer y = 10;
      System.out.println(y.byteValue());
      System.out.println(y.doubleValue());
      System.out.println(y.compareTo(5));
      System.out.println(y.compareTo(10));

      Integer p = 5;
      Integer q = 10;
      Integer r =5;
      Short a = 5;

      System.out.println(p.equals(q));  
      System.out.println(p.equals(r)); 
      System.out.println(p.equals(a));

   }
}