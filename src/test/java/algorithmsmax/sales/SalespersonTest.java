package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SalespersonTest {

    @Test
    public void testTestGetName() {
        Salesperson salesperson = new Salesperson("John Doe", 1200, 500);
        assertEquals("John Doe", salesperson.getName());
    }

    @Test
    public void testGetAmount() {
        Salesperson salesperson = new Salesperson("John Doe", 1200, 500);
        assertEquals(1200, salesperson.getAmount());
    }

    @Test
    public void testGetDifferenceFromTarget() {
        Salesperson salesperson = new Salesperson("John Doe", 1200, 500);
        assertEquals(700, salesperson.getDifferenceFromTarget());
    }
}