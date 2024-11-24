package com.sirma.ATM.account_type;

import com.sirma.ATM.User;

import java.util.UUID;

public class BankAccount {
    //public boolean verifyOwner;
    private UUID id;
    private double amount;
    private User owner;
    private String currency;
    private String name;


    public BankAccount(User user) {
        this.owner = user;
        this.currency = "BGN";
        this.name = user.getFullName() + "BankAccount";
        this.amount = 0L;
        this.id = UUID.randomUUID();
    }

    public void deposit(int amount) {
        this.amount += amount;
    }

    public void withdraw(Double amount) {
        this.amount -= amount;
    }

    public boolean verifyOwner(User user){
        return this.owner.equals(user);
    }
}
