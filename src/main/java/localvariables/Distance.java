package localvariables;

public class Distance {

    private double distanceLnKm;

    private boolean exact;

    public Distance(double distanceLnKm, boolean exact) {
        this.distanceLnKm = distanceLnKm;
        this.exact = exact;
    }

    public double getDistanceLnKm() {
        return distanceLnKm;
    }

    public boolean isExact() {
        return exact;
    }
}
