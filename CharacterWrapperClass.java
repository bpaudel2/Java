public class CharacterWrapperClass {

   public static void main(String args[]){
      /*
      Following is an example of escape character,
      Some of the escape characters are: \t, \b, \n, \r etc.
      */
      System.out.println("She said \"Hello!\" to me.");

      //Example for the Character Class.
      Character ch = 'b'; //autoboxing
      //Character class has methods like isUpperCase(), isLowerCase(), isLetter() etc

      System.out.println(Character.isLetter(3));
      System.out.println(Character.isDigit('a'));
      System.out.println(Character.isWhitespace(' '));
      System.out.println(Character.toString('a'));
      System.out.println(Character.isUpperCase('Z'));
   }
}