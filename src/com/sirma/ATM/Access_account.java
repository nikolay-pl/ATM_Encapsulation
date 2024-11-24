package com.sirma.ATM;

import com.sirma.ATM.account_type.BankAccount;

public class Access_account extends BankAccount {

    public Access_account(User user){
        super(user);
    }

    public void withdrawPublic( Double amount) {
        this.withdraw(amount);
    }
}
