package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int szam = scanner.nextInt();
        if (szam > 100) {
            System.out.println("nagyobb, mint száz");
        } else {
            System.out.println("száz, vagy kisebb");
        }

    }
}
