package com.ClientClass;

import com.BankingAccount.Account;

import java.util.ArrayList;

public class Client {
    private int id;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;

    public Client(int id,String name,String phone){
        this.id=id;
        this.name=name;
        this.phone=phone;

        accounts= new ArrayList<>();
    }

    public boolean addAccount(Account account){
        accounts.add(account);
        return true;
    }

    public boolean removeAccount(int accountId){
        for(Account account:accounts)
            if(account.getId()==accountId){
                accounts.remove(account);
                return true;
            }
        return false;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        String s= this.id + " " +this.name+ " "+this.phone+ "\n";

        for(Account account:accounts)
            s += account.toString() + "\n";
        return s;


    }


}
