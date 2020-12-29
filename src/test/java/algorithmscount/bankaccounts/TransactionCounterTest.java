package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TransactionCounterTest {

    @Test
    public void testCounter() {
        TransactionCounter transactionCounter = new TransactionCounter();
        List<Transaction> accounts = Arrays.asList(
                new Transaction("JMK145", TransactionType.CREDIT, 120),
                new Transaction("MK1478", TransactionType.DEBIT, 70),
                new Transaction("MK14555", TransactionType.CREDIT, 50),
                new Transaction("MK14500", TransactionType.DEBIT, 30)
        );
        assertEquals(2, transactionCounter.counter(accounts, 60));
    }
}