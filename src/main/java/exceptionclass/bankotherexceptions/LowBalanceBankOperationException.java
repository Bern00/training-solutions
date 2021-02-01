package exceptionclass.bankotherexceptions;

public class LowBalanceBankOperationException extends InvalidBankOperationException{
    public LowBalanceBankOperationException() {
    }

    public LowBalanceBankOperationException(String message) {
        super(message);
    }
}
