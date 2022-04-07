package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

    public static void main(String[] args) {
        List<String> designation = new ArrayList<>();

        //to add the value in the list
        designation.add("QA");
        designation.add("Delivery Manager");
        designation.add("NT Admin");
        designation.add("HR");
        designation.add("PO");

        //length method we use to get the length of array
        //size method we use to get the size of list
        //remove method to remove specific value from the list
        //get method to get specific value from the list


        for (int i =0; i<designation.size(); i++){
            //get method we use to get specific value from the list
                System.out.println(designation.get(1));
            }
        }
}
