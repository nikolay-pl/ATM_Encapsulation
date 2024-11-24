package com.sirma.ATM;

import com.sirma.ATM.account_type.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankServer {


    List<BankAccount> bankAccountList = new ArrayList<>();

    public BankServer(){

    }

    public BankAccount  createAccount(User user){
       BankAccount account  = new BankAccount(user);
       bankAccountList.add(account);
       return account;
    }

    public void deposit(User user, BankAccount acc, int amount) throws IllegalAccessException {
        if(acc.verifyOwner(user)){
            acc.deposit(amount);
        } else {
            throw  new IllegalAccessException("User is not the owner.");
        }

    }

    public void withdraw(BankAccount acc, double amount) {
        acc.withdraw(amount);
    }
}
