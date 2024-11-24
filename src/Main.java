import com.sirma.ATM.Access_account;
import com.sirma.ATM.BankServer;
import com.sirma.ATM.User;
import com.sirma.ATM.account_type.LimitedBankAccount;
import com.sirma.academy.models.Student;

public class Main {
    public static void main(String[] args) {
        //Student s1 = new Student(22, "George");
        //Student s2 = new Student(29, "Mihailo");

        User user = new User("Peter", "Pan");
        User thief = new User("Joe", "Baidan");


        BankServer server = new BankServer();
        Access_account limitedBankAccount = new Access_account(user);
        //BankAccount acc = server.createAccount(user);
        user.addAccount(acc);

        try {
            server.deposit(user, acc, 100);
            server.withdraw(acc, 200);
        } catch (IllegalAccessException e){
            System.out.println(e.getMessage());
        }

    }
}