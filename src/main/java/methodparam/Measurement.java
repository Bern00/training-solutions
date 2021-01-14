package methodparam;


public class Measurement {

    private double[] values;

    public Measurement(double[] values) {
        this.values = values;
    }
    public int findFirstIndexInLimit(int lower, int upper) {
        for(int i = 0; i < values.length; i++) {
            if(values[i] > lower && values[i] < upper) {
                return i;
            }
        }
        return -1;
    }

    public double minimum() {
        double minNumber = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minNumber) {
                minNumber = values[i];
            }
        }
        return minNumber;
    }

    public double maximum() {
        double maxNumber = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxNumber) {
                maxNumber = values[i];
            }
        }
        return maxNumber;
    }

    public ExtremValues minmax() {
        return new ExtremValues(minimum(), maximum());
    }
}
