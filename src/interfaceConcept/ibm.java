package interfaceConcept;

public interface ibm {
    void nameOfEmployee();
    void jobTitle();
    void yearsOfExperience();
    void department();
}

class Aswini implements ibm{

    public void nameOfEmployee() {
        System.out.println("My name is aswini");
    }

    public void jobTitle() {
        System.out.println("I am a delivery manager");
    }

    public void yearsOfExperience() {
        System.out.println("I spend my whole life in IBM");
    }

    public void department() {
        System.out.println("I am from EQS department");
    }

    public static void main(String[] args) {
        Aswini a = new Aswini();
        a.nameOfEmployee();
        a.jobTitle();
        a.department();
        a.yearsOfExperience();
    }
}


class Dhanya implements ibm{

    public void nameOfEmployee() {
        System.out.println("My name is Dhanya");
    }

    public void jobTitle() {
        System.out.println("I am a lead");
    }

    public void yearsOfExperience() {
        System.out.println("I am having 8 years of exp");
    }

    public void department() {
        System.out.println("I am from QA departmnt");
    }

    public static void main(String[] args) {
        Dhanya d = new Dhanya();
        d.nameOfEmployee();
        d.jobTitle();
        d.department();
        d.yearsOfExperience();
    }
}
