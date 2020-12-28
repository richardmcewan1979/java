package com.richardmcewan;

public class BankAccount {

private String accountNumber;
private double balance;
private String customerName;
private String email;
private String phoneNumber;

public BankAccount(){
    this("65567846", 100.0, "Elena C", "an_email@email.com", "0789465454545");
    System.out.println("New Default account set up.");

}

public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
    System.out.println("New account created.");
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;

}

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("7575656", 150.75, customerName, email, phoneNumber);
        System.out.println("New customer created.");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        this.balance += deposit;
        System.out.println("Deposit into: " + this.customerName + " of " + deposit);
        System.out.println("New Balance of: " + this.balance);
        System.out.println();
    }

    public void withdrawFunds(double withdrawal){
        if(this.balance - withdrawal < 0){
            System.out.println("Withdrawal from " + this.customerName + " of " + withdrawal + " attempted.");
            System.out.println("Insufficient funds.\nAvailable: " + this.balance + "\nTry another amount.");
            System.out.println();
        }
        else {
            this.balance -= withdrawal;
            System.out.println("Withdrawal from " + this.customerName + " of " + withdrawal);
            System.out.println("New balance: " + this.balance);
            System.out.println();
        }
    }


    //end curly
}

