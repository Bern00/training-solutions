package immutable;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpaceAgencyTest {

    @Test
    public void nullParameterShouldThrowException() throws NullPointerException {
        Exception ex = assertThrows(NullPointerException.class, () -> new SpaceAgency().registerSatellite(null));
        assertEquals("Parameter must not be null!", ex.getMessage());
    }

    @Test
    public void testRegisterSatellite() {
        SpaceAgency spaceAgency = new SpaceAgency();
        spaceAgency.registerSatellite(new Satellite(new CelestialCoordinates(10, 12, 15), "HNS523"));
        assertEquals("[HNS523: CelestialCoordinates: x=10.0, y=12.0, z=15.0]", spaceAgency.toString());
    }

    @Test
    public void testFindSatelliteByRegisterIdent() {
        SpaceAgency spaceAgency = new SpaceAgency();
        spaceAgency.registerSatellite(new Satellite(new CelestialCoordinates(10, 12, 15), "HNS523"));
        assertEquals("HNS523: CelestialCoordinates: x=10.0, y=12.0, z=15.0", spaceAgency.findSatelliteByRegisterIdent("HNS523").toString());
    }

    @Test
    public void testNotFindSatelliteByRegisterIdent() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new SpaceAgency().findSatelliteByRegisterIdent("LLL333"));
        assertEquals("Satellite with the given registration cannot be found!LLL333", ex.getMessage());

    }
}