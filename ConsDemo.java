public class ConsDemo{
    int myNumber;

    //No argument Constructor
    public ConsDemo(){
        myNumber = 100;
    }
    //Parameterized Constructor
    public ConsDemo(int num){
        myNumber = num;
    }
    public static void main(String args[]){
        ConsDemo demo1 = new ConsDemo();
        ConsDemo demo2 = new ConsDemo(100);
        System.out.println(demo1.myNumber +" = "+demo2.myNumber);
    }
}