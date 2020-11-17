package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adjon meg 5 számot:");

        int szam = 0;

        for (int i = 0; i < 5; i++) {

            szam = szam + scanner.nextInt();

        }

        System.out.println(szam);

    }

}
