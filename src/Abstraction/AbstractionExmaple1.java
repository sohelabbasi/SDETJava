package Abstraction;

abstract class AbstractionExmaple1 {
    //declared methods
    abstract void marks();
    abstract void grades();

    void position(){
        System.out.println("It will be decided later");
    }
}


class School extends AbstractionExmaple1{

    void marks(){
        System.out.println("This school's student has good marks");
    }

    void grades() {
        System.out.println("This school's student has good grades");
    }

    public static void main(String[] args) {
        AbstractionExmaple1 a = new School();
        a.marks();
        a.grades();
    }

}
