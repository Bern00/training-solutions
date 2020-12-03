package numbers;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg az első kör átmérőjét:");
        int diameterOne = scanner.nextInt();

        System.out.println("Adja meg a második kör átmérőjét:");
        int diameterTwo = scanner.nextInt();

        Circle circleOne = new Circle(diameterOne);
        Circle circleTwo = new Circle(diameterTwo);

        System.out.println("Az első kör kerülete: " + circleOne.perimeter());
        System.out.println("Az első kör területe: " + circleOne.area());
        System.out.println("A második kör kerülete: " + circleTwo.perimeter());
        System.out.println("A második kör területe: " + circleTwo.area());
    }
}
