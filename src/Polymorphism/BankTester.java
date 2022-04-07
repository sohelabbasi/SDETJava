package Polymorphism;

public class BankTester {

    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        HDFC h = new HDFC();
        System.out.println("value if from sbi bank" + s.interestRate());
        System.out.println("value if from icici bank" + i.interestRate());
        System.out.println("value if from hdfc bank" + h.interestRate());
    }
}
