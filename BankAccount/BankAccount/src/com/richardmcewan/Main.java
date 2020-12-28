package com.richardmcewan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount rmcewan = new BankAccount("65746465", 235.34, "Richard McEwan", "richemail@dummy.com", "07878787857");
        BankAccount elena = new BankAccount();
        BankAccount wayne = new BankAccount("Wayne", "email@email.com", "07856565656");

        VIPCustomer billgates = new VIPCustomer();
        VIPCustomer elonmusk = new VIPCustomer(5000, "email@email.com");
        VIPCustomer jeffbezos = new VIPCustomer();

        elena.setBalance(500.50);

        //some setters
        wayne.setBalance(600);
        wayne.setPhoneNumber("0798656557");
        wayne.setAccountNumber("794379384");
        wayne.setCustomerName("wayneEsquire");
        wayne.setEmail("another_email.com");

        //Reports
        System.out.println("\nReports...\n");
        reports(elena);
        reports(rmcewan);
        reports(wayne);

        System.out.println("\n VIP Reports...");
        VIPReports(billgates);
        VIPReports(elonmusk);
        VIPReports(jeffbezos);

        System.out.println("\nActions...\n");
        //Actions
        rmcewan.depositFunds(123.45);
        rmcewan.withdrawFunds(1289.20);
        rmcewan.withdrawFunds(4500);



    }

    public static void reports(BankAccount customer){
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Account Number: " + customer.getAccountNumber());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Telephone: " + customer.getPhoneNumber());
        System.out.println("balance is: " + customer.getBalance());
        System.out.println();
    }

    public static void VIPReports(VIPCustomer customer){
        System.out.println("VIP " + customer.getName());
        System.out.println("Credit Limit: " + customer.getCreditLimit());
        System.out.println("email: " + customer.getEmail());
        System.out.println();
    }





    //end curly
}
