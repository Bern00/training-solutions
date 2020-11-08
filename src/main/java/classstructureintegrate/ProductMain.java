package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner;
        System.out.println("What is the product's name?");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("How much is it?");
        scanner = new Scanner(System.in);
        int price = scanner.nextInt();

        Product product = new Product(name,price);
        System.out.println(product.getName() +": "+ product.getPrice());

        product.incrasePrice(20);
        System.out.println(product.getName() +": "+ product.getPrice());
        product.decrasePrice(5);
        System.out.println(product.getName() +": "+ product.getPrice());
    }


}
