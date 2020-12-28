package com.richardmcewan;

public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VIPCustomer(double creditLimit, String email){
        this("Blank name", creditLimit, email);
    }

    public VIPCustomer(){
        this("blank name2", 500.0, "email@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
