package practice;

public class PublicAccessModifiers {

    public static int i = 10;
    public static String name = "Amit";

    //void - non return type
    public static void typeName(){
        System.out.println(name);
    }


    public void typeAge(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        //new keyword we use to create the object of the class

      //  PublicAccessModifiers publicAccessModifiers = new PublicAccessModifiers();
       // publicAccessModifiers.typeName();
        //publicAccessModifiers.typeAge();
        //scope of local variable is only inside the method
         //int i = 20;


       // System.out.println(i);

        typeName();
    }
}
