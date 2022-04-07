package Polymorphism;

public class MethodOverloadingWithArguments {

    //changing the number of arguments
    int multiplication(int a, int b, int c){
        return a*b*c;
    }

    int multiplication(int x, int y){
        return x*y;
    }

    public static void main(String[] args) {
        MethodOverloadingWithArguments m = new MethodOverloadingWithArguments();
        System.out.println(m.multiplication(8,9));
        System.out.println(m.multiplication(3,4,5));
    }

}
