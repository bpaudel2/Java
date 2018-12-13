public class VariableArguments {

   public static void main(String args[]) {
      // Call method with variable args  
	   printMax(34, 3, 3, 2, 56.5);
      printMax(new double[]{1, 2, 3});
   }

   public static void printMax( double... numbers) {
      if (numbers.length == 0) {
         System.out.println("No argument passed");
         return;
      }

      double result = numbers[0];

      for (int i = 1; i <  numbers.length; i++)
      if (numbers[i] >  result)
      result = numbers[i];
      System.out.println("The max value is " + result);
   }
   /* FINALIZE METHOD
    * It is possible to define a method that will be called just before an object's 
    * final destruction by the garbage collector. This method is called finalize( ), 
    * and it can be used to ensure that an object terminates cleanly.For example, 
    * you might use finalize( ) to make sure that an open file owned by that object is 
    * closed.
    * To add a finalizer to a class, you simply define the finalize( ) method. 
    * The Java runtime calls that method whenever it is about to recycle an object of 
    * that class.
    * Inside the finalize( ) method, you will specify those actions that must be 
    * performed before an object is destroyed.

        The finalize( ) method has this general form −

        protected void finalize( ) {
        // finalization code here
        }


    */
}