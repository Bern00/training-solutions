package week02d04;

import java.util.Scanner;

public class InputNames {

    public void printArray(String[] strings) {
        for(int i = 0; i < strings.length; i++) {
            System.out.println(i - 1 + " " + strings[i]);
        }
    }

    public static void main(String[] args) {
        InputNames inputNames = new InputNames();
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        for(int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            names[i] = name;

        }
        inputNames.printArray(names);
    }
}
