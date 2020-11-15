package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a befektetni szándékozot tőkét:");
        int fund = scanner.nextInt();
        System.out.println("Kérem adja meg a kívánt kamatlábat:");
        int interestRate = scanner.nextInt();

        Investment befalap = new Investment(fund, interestRate);
        System.out.println("Tőke: " + befalap.getFund());
        System.out.println("Kamat: " + befalap.getInterestRate());
        System.out.println("Hozam: " + befalap.getYield(50));
        System.out.println("Kivett összeg: " + befalap.close(300));
        System.out.println("Kivett összeg: " + befalap.close(320));


    }
}
