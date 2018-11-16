public class LocalVariable{
    public void value(){
        int value =0;
        value = value+5;
        System.out.println("The value is "+value);
    }
    public static void main(String args[]){
        LocalVariable variable1 = new LocalVariable();
        variable1.value();
        /*This will print 5 because local variable value is initialized and given a value.
        *There is no default value for local variables and access modifiers can not be used
        *on local variable.
        *Local variables are implemented at stack level internally.

        */
    }   
}