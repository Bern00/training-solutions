package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number) {
        if (number <= 10) {
            return number;
        } else {
            return number - 10;
        }
    }

    public String describeNumber(int number) {
        return number == 0 ? "zero" : "not zero";
    }

    public String greetingToJoe(String name) {
        return name.equals("Joe") ? "Hello Joe" : "";
    }

    public int calculateBonus(int sale) {
        return sale >= 1000000 ? sale/10 : 0;
    }

    public int calculateConsumption(int prev, int next) {

        if (prev > 9999) {
            prev = prev - 9999;
        }

        if (next > 9999) {
            next = next - 9999;
        }

        int kolonbseg = next - prev;

        return kolonbseg;
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (a > b) {
            for(int i = a; i >= b; i--) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }

    public void printOddNumbers(int max) {
        for (int i = 1; i <= max; i = i+2) {
            System.out.println(i);
        }
    }

}
