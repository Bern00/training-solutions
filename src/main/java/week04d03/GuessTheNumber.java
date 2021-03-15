package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberTo100 = random.nextInt(100) +1;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 6; i++) {

            System.out.println("A gép kitalált egy számot. Adjon meg egy számot Ön is.");
            int number = scanner.nextInt();
            if(numberTo100 == number) {
                System.out.println("A két szám egyenlő.");
            }
            if(numberTo100 > number) {
                System.out.println("A gép által kitalált szám nagyobb.");
            }
            if(numberTo100 < number) {
                System.out.println("A gép által kitalált szám kisebb.");
            }
        }

    }
}
