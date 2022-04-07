package practice;

public class PrivateAccessModifiers {
    private String username = "Admin";
    public String password = "Test";
    public String test = "Public data";


    public void typeUsername(){
        System.out.println(username);
    }

    public void typePassword(){
        System.out.println(password);
    }

    public void typePublicString(){
        System.out.println(test);
    }

    public static void main(String[] args) {
        PrivateAccessModifiers privateAccessModifiers = new PrivateAccessModifiers();
        privateAccessModifiers.typeUsername();
        privateAccessModifiers.typePassword();
        privateAccessModifiers.typePublicString();
    }

}
