package algorithmssum.transactions;


import org.junit.jupiter.api.Test;

import static algorithmssum.transactions.TransactionOperation.CREDIT;
import static org.junit.Assert.assertEquals;

public class TransactionTest {

    @Test
    public void testGetAccountNumber() {
        Transaction transaction = new Transaction("FB235", CREDIT, 888);
        assertEquals("FB235", transaction.getAccountNumber());
    }

    @Test
    public void testGetTransactionOperation() {
        Transaction transaction = new Transaction("FB235", CREDIT, 888);
        assertEquals(CREDIT, transaction.getTransactionOperation());
    }

    @Test
    public void testGetAmount() {
        Transaction transaction = new Transaction("FB235", CREDIT, 888);
        assertEquals(888, transaction.getAmount());
    }
}