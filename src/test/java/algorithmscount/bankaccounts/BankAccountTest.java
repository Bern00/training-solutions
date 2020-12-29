package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    @Test
    public void testGetNameOfOwner() {
        BankAccount bankAccount = new BankAccount("Jack Doe", "DFR325", 120);
        assertEquals("Jack Doe", bankAccount.getNameOfOwner());
    }

    @Test
    public void testGetAccountNumber() {
        BankAccount bankAccount = new BankAccount("Jack Doe", "DFR325", 120);
        assertEquals("DFR325", bankAccount.getAccountNumber());
    }

    @Test
    public void testGetBalance() {
        BankAccount bankAccount = new BankAccount("Jack Doe", "DFR325", 120);
        assertEquals(120, bankAccount.getBalance());
    }
}