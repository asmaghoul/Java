import java.util.ArrayList;
import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    // CONSTRUCTOR

    public BankAccount() {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.accountNumber = randomAccountNumber();
        accounts++;
        totalMoney = 0;
        ;
    }

    // Be sure to increment the number of accounts
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public static void getAccounts() {
        System.out.println("The Number of Accounts is : " + accounts);
    }

    public static void getTotalMoney() {
        System.out.println("The Total Amount in our Accounts is : " + totalMoney + " £");
    }

    public String getAccountNumber() {
        return this.accountNumber;

    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings
    // account
    private String randomAccountNumber() {
        ArrayList<Integer> accountNumberArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            Random randMachine = new Random();
            int randomIndex = randMachine.nextInt(10);
            accountNumberArray.add(randomIndex);

        }
        StringBuilder accountNumberBuilder = new StringBuilder();
        for (Integer item : accountNumberArray) {
            accountNumberBuilder.append(item);
        }
        String accountNumber = accountNumberBuilder.toString();
        System.out.println(accountNumber);
        return accountNumber;
    }

    public void depositChecking(double deposit) {
        checkingBalance += deposit;
        totalMoney += deposit;
    }

    public void depositSavings(double deposit) {
        savingsBalance += deposit;
        totalMoney += deposit;
    }

    // withdraw
    public void withdrawChecking(double withdraw) {
        if (checkingBalance - checkingBalance > 0) {
            checkingBalance -= withdraw;
            totalMoney -= withdraw;
        } else {
            System.out.println(" Withdraw money is not allowed because of insufficient funds");
        }
    }

    public void withdrawSavings(double withdraw) {
        if (savingsBalance - withdraw > 0) {
            savingsBalance += withdraw;
            totalMoney -= withdraw;
        } else {
            System.out.println(" Withdraw money is not allowed because of insufficient funds");
        }

    }

    // - users should be able to withdraw money from their checking or savings
    // account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance(BankAccount bankAccount) {
        System.out
                .println(
                        "bankAccount Savings Number " + accountNumber + " has : " + bankAccount.savingsBalance + " £ ");
        System.out.println(
                "bankAccount Checking Number " + accountNumber + " has : " + bankAccount.checkingBalance + " £");
    }
}
