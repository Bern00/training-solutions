package localvariables;

public class Distance {

    private double distanceInKm;

    private boolean exact;

    public Distance(double distanceLnKm, boolean exact) {
        this.distanceInKm = distanceLnKm;
        this.exact = exact;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public boolean isExact() {
        return exact;
    }
}
