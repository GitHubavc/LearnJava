package com.ClientClass;

import com.BankingAccount.Account;

public class Main {
    public static void main(String[] args) {

        Client[] clients = new Client[2];
        clients[0]=new Client(100,"Amit","34566788");
        clients[0].addAccount(new Account(1,1000,1.6));
        clients[0].addAccount(new Account(2,2000,3.5));
        clients[1]=new Client(200,"Anu","54545997");
        clients[1].addAccount(new Account(3,1500,2.5));
        clients[1].addAccount(new Account(4,2500,2.9));
        clients[1].addAccount(new Account(5,3500,3.9));

        System.out.println(clients[0].toString());
        System.out.println(clients[1].toString());


    }
}
