public class DoWhileLoop {

   public static void main(String args[]) {
      int x = 10;
      //Unlike other loop, do while loop runs at least once because it tests the condition at the end.
      do {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }while( x < 20 );
   }
}