package algorithmssum.transactions;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TransactionSumCalculatorTest {

    @Test
    public void testSumAmountOfCreditEntries() {
        TransactionSumCalculator calculator = new TransactionSumCalculator();
        List<Transaction> transactionList = Arrays.asList(
                new Transaction("D1123", TransactionOperation.CREDIT, 875),
                new Transaction("FF235", TransactionOperation.DEBIT, 500),
                new Transaction("RE125", TransactionOperation.CREDIT, 125)
        );

        assertEquals(1000, calculator.sumAmountOfCreditEntries(transactionList));
    }
}