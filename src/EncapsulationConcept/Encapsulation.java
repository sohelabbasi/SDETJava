package EncapsulationConcept;

public class Encapsulation {

    private String NameOfCustomer;
    private double AccountNumber;
    private String username;
    private String password;
    private double balance;



    public void setNameOfCustomer(String newnameOfCustomer) {
        NameOfCustomer = newnameOfCustomer;
    }

    public String getNameOfCustomer() {
        return NameOfCustomer;
    }


    public void setAccountNumber(double accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getAccountNumber() {
        return AccountNumber;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String newusername) {
        username = newusername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newpassword) {
        password = newpassword;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newbalance) {
        balance = newbalance;
    }
}
