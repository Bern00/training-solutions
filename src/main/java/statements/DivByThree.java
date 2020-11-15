package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        System.out.println("Kérem adjon meg egy számot");
        Scanner scanner = new Scanner(System.in);
        int szam = scanner.nextInt();

        boolean oszthato = szam % 3 == 0;
        System.out.println(oszthato);
    }
}
