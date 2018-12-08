public class IfElseTest {

   public static void main(String args[]) {
      int x = 30;
      int y = 10;

      if( x == 30 ) {
         if( y == 10 ) {
            System.out.print("X = 30 and Y = 10");
         }else{
             System.out.print("x = 30 and y != 10");
         }
      }else if(x<30){
          System.out.print("x is less than 30.");
      }else{
      }
   }
}