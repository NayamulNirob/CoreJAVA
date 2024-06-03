package account;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

  


    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
         balance -= amount;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

}
