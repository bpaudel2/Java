public class WhileLoop {

   public static void main(String args[]) {
      int x = 0;
      //While loop may not even execute based on condition inside while.
      while( x < 20 ) {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }
   }
}