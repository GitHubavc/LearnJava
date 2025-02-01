package com.BankingAccount;

public class Main {
    public static void main(String[] args) {
        Account testAccount = new Account(1222,20000,4.5);
        if(testAccount.withdraw(20100))
            System.out.println("Withdraw Successful");
        else
            System.out.println("Withdraw Not Successful");

        testAccount.deposit(3000);
        System.out.println(testAccount.getId()+" "+
                testAccount.getBalance()+" "+
                testAccount.getAnnualInterestRate()+ " "+
                testAccount.getDateCreated().toString());

    }
}
