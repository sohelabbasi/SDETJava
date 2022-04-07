package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("aswini");
        names.add("mohsin");
        names.add("pooja");
        names.add("amit");
        names.add("shirin");

        //to keep the values in iterator before iterating them
        Iterator<String> itr =  names.iterator();
        while (itr.hasNext()){
                    String name = itr.next();
                    if (name.equalsIgnoreCase("amit")){
                        System.out.println(name);
                    }
            //logic to be executed
            //value to be printed
        }
    }
}
