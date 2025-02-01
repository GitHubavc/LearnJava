package com.TransactionClass;

import com.BankingAccount.Account;
import com.ClientClass.Client;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts= new ArrayList<>();

        Client client = new Client(222,"Arjun","543466576");
        accounts.add(new Account(1,1000,1.5));
        accounts.add(new Account(2,2000,2.5));

        for(Account account:accounts){
            System.out.println("Account " +account.getId() + ": ");
            System.out.println("W: " +account.countTransactions('W'));
            System.out.println("D: " +account.countTransactions('D'));


            accounts.get(0).deposit(5000);
            accounts.get(0).withdraw(2000);

            accounts.get(1).deposit(2000);
            accounts.get(1).deposit(1000);

        }

    }
}
