package classstructureintegrate;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner;
        BankAccount firstCustomer = new BankAccount("1234-5678", "Orosz Péter", 100);
        BankAccount secondCustomer = new BankAccount("0000-1122", "Amerikai Péter", 100);

        scanner = new Scanner(System.in);
        int depositAmount = scanner.nextInt();
        firstCustomer.deposit(depositAmount);
        System.out.println(firstCustomer.getInfo());

        scanner = new Scanner(System.in);
        int withdrawAmount = scanner.nextInt();
        firstCustomer.withdraw(withdrawAmount);
        System.out.println(firstCustomer.getInfo());

        scanner = new Scanner(System.in);
        int transferAmount = scanner.nextInt();
        firstCustomer.transfer(secondCustomer, transferAmount);
        System.out.println(firstCustomer.getInfo());
        System.out.println(secondCustomer.getInfo());


    }
}
