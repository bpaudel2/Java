class FreshJuiceTest {
   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
   FreshJuiceSize size;
}
/* Enums
 * Enums restrict a variable to have one of only a few predefined values.
 * It is possible to reduce number of bugs using enum.
 * Enums can be defined inside a class or on their own.
 */
public class FreshJuice {

   public static void main(String args[]) {
      FreshJuiceTest juice = new FreshJuiceTest();
      juice.size = FreshJuiceTest.FreshJuiceSize.MEDIUM ;
      System.out.println("Size: " + juice.size);
   }
}