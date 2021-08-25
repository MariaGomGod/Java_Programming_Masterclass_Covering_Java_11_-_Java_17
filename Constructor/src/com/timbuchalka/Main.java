package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account.
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field.
        // Create two additional methods:
        // To allow the customer to deposit funds (this should increment the balance field).
        // To allow the customer withdraw the founds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if they are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

//        Account bobsAccount = new Account(); //"12345", 0.00,
//                //"Bob", "myemail@bob.com", "(087) 123-4567");
//        System.out.println(bobsAccount.getAccountNumber());
//        System.out.println(bobsAccount.getBalance());
//        System.out.println(bobsAccount.getCustomerName());
//        System.out.println(bobsAccount.getEmail());
//        System.out.println(bobsAccount.getPhoneNumber());
//
//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhoneNumber("(087) 123-4567");
//
//        bobsAccount.withdrawFunds(100.0);
//
//        bobsAccount.depositFunds(50.0);
//        bobsAccount.withdrawFunds(100.00);
//
//        bobsAccount.depositFunds(51.0);
//        bobsAccount.withdrawFunds(100.00);
//
           Account timAccount = new Account("Tim", "tim@email.com", "12345");
           System.out.println(timAccount.getAccountNumber() + " name " + timAccount.getCustomerName());
           System.out.println("Current balance is " + timAccount.getBalance());
           timAccount.withdrawFunds(100.55);

        // Create a new class VipCustomer
        // It should have 3 fields name, credit limit and email address.
        // Create 3 constructors.
        // 1st constructor empty should call the constructor with 3 parameters with default values.
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd.
        // 3rd constructor should have fields.
        // Create getters only for this using code generation of IntelliJ as setters wont be needed.
        // Test and confirm it works.

//        VipCustomer customer = new VipCustomer();
//        System.out.println("Name: " + customer.getName() + " Credit limit: " + customer.getCreditLimit()
//                + " Email: " + customer.getEmail());
//
//        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
//        System.out.println("Name: " + customer2.getName() + " Credit limit: " + customer2.getCreditLimit()
//                + " Email: " + customer2.getEmail());
//
//        VipCustomer customer3 = new VipCustomer("Tim", 100.00, "tim@email.com");
//        System.out.println("Name: " + customer3.getName() + " Credit limit: " + customer3.getCreditLimit()
//                + " Email: " + customer3.getEmail());
    }
}



