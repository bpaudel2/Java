class SuperInstanceof{}
public class TestInstanceof extends SuperInstanceof{
    public static void main(String args[]){
        SuperInstanceof x = new TestInstanceof();
        //This returns true if the object being compared is the assignment compatible with the type on right
        boolean result = x instanceof TestInstanceof;
        System.out.println(result);
    }
}