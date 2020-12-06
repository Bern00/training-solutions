package enumtype.unit;

public enum LengthUnit {

    MILLIMETER(true, 1.0),
    CENTIMETER(true, 10.0),
    METER(true, 1000.0),
    YARD(false, 914.4),
    FOOT(false, 304.8),
    INCH(false, 25.4);

    private final boolean si;

    private final double inMILIMETER;

    LengthUnit(boolean si, double inMILIMETER) {
        this.si = si;
        this.inMILIMETER = inMILIMETER;
    }

    public boolean isSi() {
        return si;
    }

    public double getInMILIMETER() {
        return inMILIMETER;
    }
}
