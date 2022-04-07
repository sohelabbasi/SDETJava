package inheritance;

public class QA extends Employee{
        double earlyJoiningBonus = 25000;
       // static double salaryOfEmployee = 5000;



        public static void main(String[] args) {
            QA qa = new QA();
            System.out.println("The salary of QA is " + qa.salaryOfEmployee);
           // System.out.println(salaryOfEmployee);
            System.out.println("The name of organization is " + qa.orgName);
            System.out.println("The joining bonus for QA is: " + qa.earlyJoiningBonus);
            qa.getSalary();
        }

        //super keyword we use for 3 things
    // to call the method of parent class we use super keyword
    //to call the variables of parent class we use super keyword
    //to call the parent class constructor
}



