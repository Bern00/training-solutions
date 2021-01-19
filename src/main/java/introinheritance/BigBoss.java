package introinheritance;

public class BigBoss extends Boss {

    private double bonusz;

    public BigBoss(String name, String address, double salary, int numberOfEmployees, double bonusz) {
        super(name, address, salary, numberOfEmployees);
        this.bonusz = bonusz;
    }

    public double getBonusz() {
        return bonusz;
    }

    public int getNumberOfEmployees() {
        return super.getNumberOfEmployees();
    }

    public double getSalary() {
        return super.getSalary() + bonusz;
    }
}
