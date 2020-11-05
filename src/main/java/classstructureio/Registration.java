package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        System.out.println("Kérem adja meg a nevét:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Kérem adja meg az e-mail címét:");
        String email = scanner.nextLine();
        System.out.println("Az Ön neve:" + name);
        System.out.println("Az Ön e-mail címe:" + email);

    }
}
