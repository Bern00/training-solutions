package algorithmssum.sales;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SalespersonTest {

    @Test
    public void testTestGetName() {
        Salesperson salesperson = new Salesperson("Tóth Balázs", 20);
        assertEquals("Tóth Balázs", salesperson.getName());
    }

    @Test
    public void testGetAmount() {
        Salesperson salesperson = new Salesperson("Tóth Balázs", 20);
        assertEquals(20, salesperson.getAmount());
    }
}