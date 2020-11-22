package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Virág", 1995, 8500);
        employee.raiseSalary(1200);
        System.out.println(employee.getSalary());
        System.out.println(employee.toString());
    }
}
