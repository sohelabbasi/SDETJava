package practice;

public class DefaultAccessModifier {

    int i =5;
    public int z = 10;

    void defaultMethod(){
        System.out.println("I am default method");
        System.out.println(i);
    }

    public static void main(String[] args) {
        DefaultAccessModifier defaultAccessModifier = new DefaultAccessModifier();
        defaultAccessModifier.defaultMethod();
    }
}
