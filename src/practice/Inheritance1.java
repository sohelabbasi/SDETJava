package practice;

public class Inheritance1 {

    String name;
    int age=19;
    String courseName;
    int grades=65;

    public void ageOfStudent(){
        System.out.println(age);
    }

    public void gradesOfStudent(){
        System.out.println(grades);
    }

}

class section extends Inheritance1{
    int grades = 75;
    int age = 20;
    int fees = 500;

    public void gradesOfStudent(){
        super.gradesOfStudent();
    }

}


