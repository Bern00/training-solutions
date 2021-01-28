package exceptions.polinom;

public class Polynomial {
    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        if(coefficients == null) {
            throw new NullPointerException("coefficients is null");
        }
        this.coefficients = coefficients;
    }

    public Polynomial(String[] coefficientsStr) {
        if(coefficientsStr == null) {
            throw new NullPointerException("coefficientStrs is null");
        }

        try {
            this.coefficients = converter(coefficientsStr);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Illegal coefficients, not a number", ex);
        }
    }

    public double evaluate(double x) {
        int n = coefficients.length - 1;
        double sum = 0;
        for (int j = n; j >= 0; j--) {
            sum += coefficients[j] * Math.pow(x,(double)n - j);
        }
        return sum;
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    public double[] converter(String[] str) {
        double[] convertStr = new double[str.length];
        if(str == null) {
            throw new NullPointerException("coefficients is null");
        }
        for(int i = 0; i < str.length; i++) {
            convertStr[i] = Double.parseDouble(str[i]);
        }

        return convertStr;
    }
}
