import java.io.File;
import java.io.FileReader;

public class FilesnotFoundDemo {
   /* Checked exceptions − A checked exception is an exception that is
    * checked (notified) by the compiler at compilation-time, these are also 
    * called as compile time exceptions. These exceptions cannot simply
    * be ignored, the programmer should take care of (handle) these exceptions.
    */
   public static void main(String args[]) {		
      File file = new File("E://file.txt");
      FileReader fr = new FileReader(file); 
   }
}