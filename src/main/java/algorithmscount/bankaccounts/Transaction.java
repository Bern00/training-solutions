package algorithmscount.bankaccounts;

public class Transaction {

    private String accountNumber;
    private TransactionType transactionType;
    private int balance;

    public Transaction(String accountNumber, TransactionType transactionType, int balance) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public int getBalance() {
        return balance;
    }
}
