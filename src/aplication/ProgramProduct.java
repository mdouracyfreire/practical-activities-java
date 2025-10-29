package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
//        System.out.print("Quantity in stock: ");
//        int quatity = input.nextInt();

        Product product = new Product(name, price);

        System.out.println("\nProduct data: " + product);

        System.out.print("\nEnter the number of the products to be added in stock: ");
        int quatity = input.nextInt();
        product.addProducts(quatity);

        System.out.println("\nUpdated data: " + product);

        System.out.print("\nEnter the number of the products to be removed in stock: ");
        quatity = input.nextInt();
        product.removeProducts(quatity);

        System.out.println("\nUpdated data: " + product);

        input.close();
    }
}
