package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println("Adja meg a következő feladat eredményét: ");
        System.out.println("5 * ( 3 - 15 / 3 ) =");
        double szam = 5 * ( 3 - 15 / 3 );

        Scanner scanner = new Scanner(System.in);
        double megoldas = scanner.nextDouble();

        System.out.println(Math.abs(megoldas - szam ) < 0.0001);

    }
}
