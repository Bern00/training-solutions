package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator validator = new UserValidator();
        System.out.println("Kérem adga meg a felhasználó nevét:");
        String UserName = scanner.nextLine();
        System.out.println(validator.isValidUserName(UserName) ? "Helyes felhasználó név" : "Helytelen felhasználó név");
        System.out.println("Kérem adja meg az email címét:");
        String email = scanner.nextLine();
        System.out.println(validator.isValidEmail(email) ? "Helyes email cím" : "Helytelen email cím");
        System.out.println("Kérem adja meg a jelszavát:");
        String password1 = scanner.nextLine();
        System.out.println("Kérem adja meg a jelszavát újra:");
        String password2 = scanner.nextLine();
        System.out.println(validator.isValidPassword(password1, password2) ? "Helyes jelszó" : "Helytelen jelszó");
    }
}
