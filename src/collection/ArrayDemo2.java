package collection;

public class ArrayDemo2 {

    public static void main(String[] args) {

        int z[] = {3,5,7,9,2,5,6};

        for (int i=0; i<z.length; i++){
            System.out.println(z[i]);
        }


        for(int valueAbouttoprint:z){
            System.out.println(valueAbouttoprint);
        }
    }
}
