//mohamed hamed 
//20176672
public class BankAccount {
    private double balance;
    private String username;
    private String bankname;
    private static final String country = "Egypt";
    private static int numOfUsers = 0;
    private static int numOfCalls = 0;

    public BankAccount() {
        balance = 0;
        username = "";
        bankname = "";
        numOfUsers++;
        System.out.println("New BankAccount object created.");
    }

    public BankAccount(double initialBalance, String username, String bankname) {
        balance = initialBalance;
        this.username = username;
        this.bankname = bankname;
        numOfUsers++;
        System.out.println("New BankAccount object created.");
    }

    public void deposite(double amount) {
        balance += amount;
        numOfCalls++;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            numOfCalls++;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static int getNumOfUsers() {
        return numOfUsers;
    }

    public static int getNumOfCalls() {
        return numOfCalls;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(1000, "John", "ABC Bank");

        account1.deposite(500);
        account2.withdraw(200);

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());

        System.out.println("Number of users: " + BankAccount.getNumOfUsers());
        System.out.println("Number of calls (Deposite()): " + BankAccount.getNumOfCalls());
        System.out.println("Number of calls (Withdraw()): " + BankAccount.getNumOfCalls());
    }
}
