package collection;

import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] previousArray = {10,20,30,40,50};
        for (int i=0; i<previousArray.length; i++){
            System.out.println(previousArray[i]);
        }

        System.out.println("-------------------------Separation--------------------------");


        previousArray = Arrays.copyOf(previousArray, 10);

        previousArray[5] = 60;
        previousArray[6] = 70;
        previousArray[7] = 70;
        previousArray[8] = 70;
        previousArray[9] = 70;

        for (int i=0; i<previousArray.length; i++){
            System.out.println(previousArray[i]);
        }
    }
}
