package EncapsulationConcept;

public class EncapsulationTester {

    public static void main(String[] args) {

        Encapsulation e = new Encapsulation();
        e.setNameOfCustomer("Vishal");
        e.setAccountNumber(180750);
        e.setBalance(100000);
        e.setUsername("vishal123");
        e.setPassword("12345");

        System.out.println(e.getNameOfCustomer());
        System.out.println(e.getAccountNumber());
        System.out.println(e.getUsername());
        System.out.println(e.getBalance());
        System.out.println(e.getPassword());
    }
}
