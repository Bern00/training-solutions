package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import static algorithmscount.bankaccounts.TransactionType.CREDIT;
import static org.junit.Assert.assertEquals;

public class TransactionTest {

    @Test
    public void testGetAccountNumber() {
        Transaction transaction = new Transaction("MK145", CREDIT, 120);
        assertEquals("MK145", transaction.getAccountNumber());
    }

    @Test
    public void testGetTransactionType() {
        Transaction transaction = new Transaction("MK145", CREDIT, 120);
        assertEquals(CREDIT, transaction.getTransactionType());
    }

    @Test
    public void testGetBalance() {
        Transaction transaction = new Transaction("MK145", TransactionType.CREDIT, 120);
        assertEquals(120, transaction.getBalance());
    }
}