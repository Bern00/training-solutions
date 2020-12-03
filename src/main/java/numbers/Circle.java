package numbers;

public class Circle {

    private final double PI = 3.14;
    private int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public double perimeter() {
        return diameter*PI;
    }

    public double area() {
        return (diameter/2)*(diameter/2)*PI;
    }
}
