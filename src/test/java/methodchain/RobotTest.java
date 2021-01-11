package methodchain;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {

    private Robot robot;

    @BeforeEach
    public void setUp() {
        this.robot = new Robot();
    }

    @AfterEach
    public void tearDown() {
        this.robot = null;
    }

    @Test
    public void testGo() {
        robot.go(5).go(3);
        assertEquals(8, robot.getDistance());
    }

    @Test
    public void testRotate() {
        robot.rotate(12).rotate(-8);
        assertEquals(4, robot.getAzimut());
    }

    @Test
    public void testRegisterNavigationPoint() {
        robot.go(5).rotate(30).registerNavigationPoint().go(20).rotate(10).registerNavigationPoint();
        assertEquals("[actualDistance:5, actualAzimut:30, actualDistance:25, actualAzimut:40]", robot.getNavigationPoints().toString());
    }
}