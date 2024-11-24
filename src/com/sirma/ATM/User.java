package com.sirma.ATM;

import com.sirma.ATM.account_type.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private List<BankAccount> accountList;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountList = new ArrayList<>();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void addAccount(BankAccount account){
        this.accountList.add(account);
    }
}
