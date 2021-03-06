package immutable;

public class CelestialCoordinates {

    private final double x;
    private final double y;
    private final double z;

    public CelestialCoordinates(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "CelestialCoordinates: " +
                "x=" + x +
                ", y=" + y +
                ", z=" + z;
    }
}
