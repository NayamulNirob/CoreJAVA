package account;

public class CheckingAccount extends BankAccount {

    private double withdrawalLimit;
    private double fee;

    public CheckingAccount(int par, int par1, int par2) {
    }

    public CheckingAccount(double withdrawalLimit, double fee) {
        this.withdrawalLimit = withdrawalLimit;
        this.fee = fee;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;

    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            balance -= amount;
        } else {
            balance -= amount + fee;
        }
    }

    @Override
    public double calculateInterest() {
        return 0.0;
    }

}
