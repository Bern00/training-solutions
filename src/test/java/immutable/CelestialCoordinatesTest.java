package immutable;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CelestialCoordinatesTest {

    @Test
    public void testToString() {
        assertEquals("CelestialCoordinates: x=12.0, y=13.0, z=14.0", new CelestialCoordinates(12, 13, 14).toString());
    }
}