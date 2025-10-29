package aplication;

import entities.ProductVect;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProductVect {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ProductVect[] vect = new ProductVect[n];

        for (int i = 0; i < vect.length; i++) {
            input.nextLine();
            String name = input.nextLine();
            double price = input.nextDouble();
            vect[i] = new ProductVect(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("AVARAGE PRICE = %.2f%n", avg);

        input.close();
    }
}
