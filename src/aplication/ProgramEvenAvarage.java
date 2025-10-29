package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEvenAvarage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();
        int[] vect = new int[n];
        int sum = 0;
        int quantEven = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = input.nextInt();

            if (vect[i] % 2 == 0) {
                sum += vect[i];
                quantEven++;
            }
        }

        if (quantEven == 0) {
            System.out.print("NENHUM NÚMERO PAR");
        }
        else {
            System.out.printf("MÉDIA DOS NÚMEROS PARES = %.1f", (double)(sum / quantEven));
        }

        input.close();
    }
}
