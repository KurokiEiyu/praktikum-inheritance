public class CheckingAccount extends Account {
    
    private double overdraftProtection;

    public CheckingAccount(double accountNumber, double balance){
        super(accountNumber);
        this.balance = balance;
        overdraftProtection = 0.1;
    }

    public CheckingAccount(double accountNumber, double balance, double protect){
        super(accountNumber);
        this.balance = balance;
        overdraftProtection = protect;
    }
    
    public boolean withdraw(double amount){
        super.withdraw(amount);
        double protectNeed = amount - this.balance;
        if (balance - amount >= 0){
            this.balance -= amount;
            return true;
        } else {
            if(overdraftProtection == -1.0 || overdraftProtection < protectNeed ) {
                return false;
            } else {
                this.balance = 0.0;
                overdraftProtection -= protectNeed;
                return true;
            }
        }
    }
}
