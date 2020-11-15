package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        System.out.println("Kérem adja meg kezdés időpontját:");
        Scanner scanner = new Scanner(System.in);
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        System.out.println("Kérem adja meg végzés időpontját:");
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        Time munkakezdet = new Time(hours1, minutes1, seconds1);
        Time munkavege = new Time(hours2, minutes2, seconds2);

        System.out.println(munkakezdet);
        System.out.println(munkakezdet.getInMinutes() + " perc");
        System.out.println(munkavege);
        System.out.println(munkavege.getInSeconds() + " másodperc");
        System.out.println(munkakezdet.earlierThan(munkavege));
    }
}
