public class SwitchTest {


    /*The variable used in a switch statement 
     *can only be integers, convertable integers (byte, short, char), strings and enums.
    */
    public static void main(String args[]) {
      SwitchTest test = new SwitchTest();
      test.switchTestFunction('A');
      test.switchTestFunction('B');
      test.switchTestFunction('C');
      test.switchTestFunction('D');

    }


    public void switchTestFunction(char grade){
        switch(grade) {
            case 'A' :
                System.out.println("Excellent!"); 
                break;
            //example of fall through
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    } 
      
}