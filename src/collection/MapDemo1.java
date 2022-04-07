package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

    public static void main(String[] args) {
        //implementing the map

        Map<Integer, String> employeeData = new HashMap<Integer, String>();

        //to add the key and value in map
        employeeData.put(001,"nelson");
        employeeData.put(002, "amit");
        employeeData.put(003, "dilip");
        employeeData.put(004, "shirin");
        employeeData.put(005, "kirtana");
        employeeData.put(006, "sohel");
        employeeData.put(007, "shyamu");

     //   System.out.println(employeeData);
    //    System.out.println(employeeData.entrySet());
       for (Map.Entry newMap: employeeData.entrySet()){
           System.out.println(newMap.getKey() + " " + newMap.getValue());
          // System.out.println(newMap.getValue());
       }
    }
}
