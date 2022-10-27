public abstract class Account {
    
    protected double balance;

    public Account(double accountNumber){
        balance = accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean deposit(double amount){
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount){
        balance -= amount;
        return true;
    }
}
