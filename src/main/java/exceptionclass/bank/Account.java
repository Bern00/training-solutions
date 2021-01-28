package exceptionclass.bank;

public class Account {

    private String accountNumber;
    private double balance;
    private double maxSubtract;
    private static final double INITIAL_MAX_SUBTRACT = 100000;

    public Account(String accountNumber, double balance) {
        if(accountNumber == null) {
            throw new IllegalArgumentException("accountNumber");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = INITIAL_MAX_SUBTRACT;
    }

    public void setMaxSubtract(double maxSubtract) throws InvalidBankOperationException{
        if(maxSubtract <= 0) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        this.maxSubtract = maxSubtract;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }



    public double subtract(double number) throws InvalidBankOperationException{
        if(number > maxSubtract || number < 0) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        if(number > balance) {
            throw new InvalidBankOperationException(ErrorCode.LOW_BALANCE);
        }
        this.balance -= number;
        return balance;
    }

    public double deposit(double number) throws InvalidBankOperationException{
        if(number < 0) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        this.balance += number;
        return balance;
    }
}
