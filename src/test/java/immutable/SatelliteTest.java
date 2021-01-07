package immutable;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SatelliteTest {

    @Test
    public void emptyParameterShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Satellite(new CelestialCoordinates(1, 2, 3), ""));
        assertEquals("Register ident must not be empty!", ex.getMessage());
    }

    @Test
    public void testModifyDestination() {
        Satellite satellite = new Satellite(new CelestialCoordinates(10, 20, 30), "GFR875");
        satellite.modifyDestination(new CelestialCoordinates(1, 1, 1));

        assertEquals("GFR875: CelestialCoordinates: x=11.0, y=21.0, z=31.0", satellite.toString());
    }

}