public class InstanceofOperator{
    /*Instanceof Operator is used for object reference variable.
     It checks whether the object is of particular type(class type or interface type)
     It has to pass the IS-A test to return true.
     For example: 
     ( Object reference variable ) instanceof  (class/interface type)
     above line true is variable IS-A class/interface type
    */
    public static void main(String args[]){
        String location="Edmond";
        boolean result = location instanceof String;
        System.out.println(result);

    }
}