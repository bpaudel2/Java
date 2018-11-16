public class Dog {
   String breed;
   int age;
   String color;
   String name;
   /*A constructor should have same name as Class name.
    *A class can have more than one constructor.
    *Local variables: are defined inside methods, constructors.
    *Instance variables: defined within class but outside any method.
    *Instance variables can be accessed from inside any method, constructors,
    *or blocks of that class.
    *Class variables: Declared within a class but outside of any method, with static keyword.
    *Some other things to keep in mind, *there can be only one public class per source file 
    *but can have multiple non-public classes *public class name should be the name of source 
    *file name *first package statement and then import statements and then class
    *Import and package statements will imply all the class present in the source file.
    */
   public Dog(){}
   public Dog(String name){
       System.out.println("Passed name is "+name);
       this.name = name;
   }
   public void setAge(int age){
       this.age = age;
   }
   public void setColor(String color){
       this.color = color;
   }
   public int getAge(){
       return age;
   }
   public String getColor(){
       return color;
   }
   void barking() {
   }

   void hungry() {
   }

   void sleeping() {
   }
   public static void main(String[]args){
       Dog myDog = new Dog();
       Dog herDog = new Dog("Jack");
       myDog.setAge(2);
       myDog.setColor("White");
       herDog.setAge(1);
       herDog.setColor("Brown");
       System.out.println("Her dog name is "+herDog.name);
       System.out.println("Her dog color is "+herDog.color);
       System.out.println("My dong is "+myDog.name+ " and it is "+myDog.color);


   }
}