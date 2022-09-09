package week4;

public class Ex72 {
    public static void main(String[] args) {
        Account accountA = new Account("Account A: ",100);
        Account accountB = new Account("Account B: ",0);
        Account accountC = new Account("Account C: ",0);

        System.out.println("Initial state");
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);

        transfer(accountA, accountB, 50);
        System.out.println("First transfer");
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);

        transfer(accountB, accountC, 25);
        System.out.println("Second transfer");
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
    }

    public static void transfer(Account from, Account to, double amount) {
        from.withdrawal(amount);
        to.deposit(amount);
    }
}
