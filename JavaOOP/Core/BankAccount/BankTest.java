public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3 = new BankAccount();
        // Deposit Test
        bankAccount1.depositChecking(450);
        bankAccount1.depositSavings(20000);
        bankAccount1.withdrawChecking(8000);
        // bankAccount1.getBalance(bankAccount1);
        bankAccount2.depositChecking(6000);
        bankAccount2.depositSavings(3500);
        bankAccount3.depositChecking(50000);
        bankAccount3.depositSavings(10000);
        bankAccount3.withdrawSavings(9950);
        bankAccount1.getBalance(bankAccount1);
        bankAccount2.getBalance(bankAccount2);
        bankAccount3.getBalance(bankAccount3);
        // - deposit some money into each bank account's checking or savings account and
        // display the balance each time
        // - each deposit should increase the amount of totalMoney
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account
        // and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        // Static Test (print the number of bank accounts and the totalMoney)
        BankAccount.getAccounts();
        BankAccount.getTotalMoney();
    }
}
