package RealMultiThreadingBankAccount;

public class JointAccount {
    private double balance;

    public JointAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        synchronized (this){
            balance -= amount;
        }

    }
}
