package inheritancemethods.bankaccount;

public class DebitAccount {

    private static final double COST = 3.0;
    private static final long MIN_COST = 200;
    private String accountNumber;
    private long balance;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public final long costOfTransaction(long amount) {
        long number = amount * (long)COST / 100;
        if(number > MIN_COST) {
            return number;
        }
        return MIN_COST;
    }

    public boolean transaction(long amount) {
        long trx = amount + costOfTransaction(amount);
        if(trx > balance) {
            return false;
        }
        balance -= trx;
        return true;
    }

    public void balanceToZero() {
        this.balance = 0;
    }
}
