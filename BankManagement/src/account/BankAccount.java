
package account;

 public abstract class BankAccount {
    
public double balance;

    
    public abstract void deposit(double amount);

   
    public abstract void withdraw(double amount);

    
    public abstract double calculateInterest();
}
