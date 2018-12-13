public class StringBuilderBufferTest {
   /*StringBuilders methods are not thread safe (not synchronised).
   It is recommended to use StringBuilder whenever possible because it is faster than StringBuffer. 
   However, if the thread safety is necessary, the best option is StringBuffer objects.
   */
   public static void main(String args[]) {
      StringBuffer sBuffer = new StringBuffer("test");
      sBuffer.append(" String Buffer");
      System.out.println(sBuffer);  
   }
}
