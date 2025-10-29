package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHighestPosition {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = input.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = input.nextDouble();
        }

        double highest = 0.0;
        int position = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > highest) {
                highest = vect[i];
                position = i;
            }
        }

        System.out.println("\nMAIOR VALOR = " + highest);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + position);

        input.close();
    }
}
