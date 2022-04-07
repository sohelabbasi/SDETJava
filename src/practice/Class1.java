package practice;

public class Class1 {

    //type main
    public static void main(String[] args) {
        System.out.println("Hello");

     //   PublicAccessModifiers publicAccessModifiers = new PublicAccessModifiers();
     //   publicAccessModifiers.typeAge();
     //   publicAccessModifiers.typeName();
        PublicAccessModifiers.typeName();

        PrivateAccessModifiers privateAccessModifiers = new PrivateAccessModifiers();

        DefaultAccessModifier defaultAccessModifier = new DefaultAccessModifier();
        defaultAccessModifier.defaultMethod();
    }


}
