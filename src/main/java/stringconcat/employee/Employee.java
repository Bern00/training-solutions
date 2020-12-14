package stringconcat.employee;

public class Employee {

    private String name;
    private String occupation;
    private int payment;

    public Employee(String name, String occupation, int payment) {

        if(name.equals("")
                || name.equals(null)
                || occupation.equals("")
                || occupation.equals(null)
                || payment%1000 != 0) {
            throw new IllegalArgumentException("Not valid information");
        }

        this.name = name;
        this.occupation = occupation;
        this.payment = payment;
    }

    public String toString() {
        return name + " - " + occupation + " - " + payment +" Ft";
    }

    
}
