package Demo8_6;

public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private int id;
    private double balance;
    public BankAccount(){
        this.id = bankAccountCount++;
    }
    static void setInterestRate(double interestRate){
        BankAccount.interestRate = interestRate;
    }
    void deposit(double ammount){
        this.balance += ammount;
    }
    double getInterest(int years){
        return BankAccount.interestRate * years * this.balance;
    }
}
