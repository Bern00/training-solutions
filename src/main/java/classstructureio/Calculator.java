package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Give two number please.");
        Scanner scanner = new Scanner(System.in);

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        System.out.println(numberOne + " + " + numberTwo);
        System.out.println(numberOne + numberTwo);
    }
}
