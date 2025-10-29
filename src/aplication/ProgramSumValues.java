package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSumValues {
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

        double sum = 0.0;
        System.out.print("\nVALORES =");
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
            System.out.printf(" %.1f ", vect[i]);
        }

        double avg = sum / vect.length;
        System.out.printf("\nSOMA = %.2f", sum);
        System.out.printf("\nMÉDIA = %.2f", avg);

        input.close();
    }
}
