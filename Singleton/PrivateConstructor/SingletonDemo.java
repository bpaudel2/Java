public class SingletonDemo {

   public static void main(String[] args) {
      //Calling getInstance which will return Singleton object
      //No matter how many times you call this method always return the same singleton object
      Singleton tmp = Singleton.getInstance( );
      tmp.demoMethod( );
   }
}