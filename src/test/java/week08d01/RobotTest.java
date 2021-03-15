package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest{

    @Test
    public void testMove() {
        Robot robot = new Robot();
        Position position = robot.move("LLLJLFFBBLJJL");
        assertEquals(position.getY(), -4);
        assertEquals(position.getX(), 1);
    }
}