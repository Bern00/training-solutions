package methodvarargs;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExamStatsTest {

    @Test
    public void testGetNumberOfTopGrades() {
        ExamStats examStats = new ExamStats(250);
        assertEquals(2, examStats.getNumberOfTopGrades(60, 71, 210, 183));
    }

    @Test
    public void zeroResultsShouldThrowException() throws IllegalArgumentException {

        ExamStats examStats = new ExamStats(250);
        Exception ex = assertThrows(IllegalArgumentException.class, () -> examStats.getNumberOfTopGrades(85));
        assertEquals("Number of results must not be empty!", ex.getMessage());
    }

    @Test
    public void nullResultsShouldThrowException() throws IllegalArgumentException {

        ExamStats examStats = new ExamStats(250);

        Exception ex = assertThrows(IllegalArgumentException.class, () -> examStats.getNumberOfTopGrades(85, null));
        assertEquals("Number of results must not be empty!", ex.getMessage());
    }


    @Test
    public void testHasAnyFailed() {
        ExamStats examStats = new ExamStats(250);
        assertTrue(examStats.hasAnyFailed(60, 71, 210, 183));
        assertFalse(examStats.hasAnyFailed(60, 171, 210, 183));
    }

    @Test
    public void zeroResultsShouldThrowExceptionWithFails() throws IllegalArgumentException {
        ExamStats examStats = new ExamStats(250);
        Exception ex = assertThrows(IllegalArgumentException.class, () -> examStats.hasAnyFailed(50));
        assertEquals("Number of results must not be empty!", ex.getMessage());
    }
}