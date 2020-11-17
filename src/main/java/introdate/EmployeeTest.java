package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("Kérem adja meg a nevét:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Mikor született?");
        int year = scanner.nextInt();
        int mounth = scanner.nextInt();
        int day = scanner.nextInt();
        Employee employee = new Employee(year, mounth, day, name);
        System.out.println(employee.toString());


    }

}
