import com.sirma.ATM.Access_account;
import com.sirma.ATM.BankServer;
import com.sirma.ATM.User;
import com.sirma.ATM.account_type.LimitedBankAccount;
import com.sirma.academy.models.Student;

public class Main {
    public static void main(String[] args) {


        User user = new User("Peter", "Pan");
        User thief = new User("Joe", "Baidan");


        BankServer server = new BankServer();
        Access_account limitedBankAccount = new Access_account(user);
        BankAccount acc = server.createAccount(user);
        user.addAccount(acc);

        try {
            server.deposit(thief, acc, 100);
            server.withdraw(acc, 200);
        } catch (IllegalAccessException e){
            System.out.println(e.getMessage());
        }

    }
}
