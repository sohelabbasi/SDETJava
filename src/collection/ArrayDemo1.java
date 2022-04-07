package collection;

public class ArrayDemo1 {

    public static void main(String[] args) {
        //declaration and instantiation
        int z[] = new int[5];
        //initialization of array
        z[0] = 5;
        z[1] = 4;
        z[2] = 3;
        z[3] = 2;
        z[4] = 1;

        //length method is used to define the length of an array
        for (int i=0; i<z.length; i++){
            System.out.println(z[i]);
        }
    }

}
