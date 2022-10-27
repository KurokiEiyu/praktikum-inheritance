public class SavingAccount extends Account {
    
    private double interestRate;

    public SavingAccount(double accountNumber, double balance, double interest_rate){
        super(accountNumber);
        super.balance = balance;
        interestRate = interest_rate;
    }
}
