package Polymorphism;

class Overriding {

    public void age(){
        System.out.println("Parent's age is 45");
    }

    public void clickOnWebElement(){
        System.out.println("It will click on web element");
    }
}

class Child extends Overriding{
    public void age(){
        System.out.println("Child's age is 10");
    }

    public void clickOnWebElement(){
        System.out.println("It will click on login button");
    }


    public static void main(String[] args) {
        Child c = new Child();
        c.age();
        c.clickOnWebElement();
    }

}

