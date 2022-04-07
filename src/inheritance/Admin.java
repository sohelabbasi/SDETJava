package inheritance;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Admin extends Employee{

    String department = "Networking";

    public static void main(String[] args) {
        Admin a = new Admin();
        System.out.println(a.orgName);
        System.out.println(a.department);
    }

}
