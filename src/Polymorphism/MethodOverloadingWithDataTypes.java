package Polymorphism;

public class MethodOverloadingWithDataTypes {

    static long addition(long a, long b, long c){
        return a+b+c;
    }

    static int addition(int x, int y, int z){
        return x+y+z;
    }


    public static void main(String[] args) {
        System.out.println(addition(3,5,6));
        System.out.println(addition(345,56789, 89765));
    }

}
