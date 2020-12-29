package algorithmscount.bankaccounts;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BankAccountConditionCounterTest {

    @Test
    public void testAccountCounter() {
        BankAccountConditionCounter conditionCounter = new BankAccountConditionCounter();
        List<BankAccount> accounts = Arrays.asList(
                new BankAccount("Jack Doe", "DFR325", 120),
                new BankAccount("John Smith", "DFK471", 50),
                new BankAccount("John Doe", "AS4546", 12),
                new BankAccount("Jakbil Aeron", "QW0214", 90)
    );
        assertEquals(2, conditionCounter.accountCounter(accounts, 70));
    }
}