package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBelowAvarage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();
        double[] vect = new double[n];

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = input.nextDouble();
            sum += vect[i];
        }

        double avg = sum / vect.length;
        System.out.printf("\nMÉDIA DO VETOR = %.3f%n", avg);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < avg) {
                System.out.println(vect[i]);
            }
        }

        input.close();
    }
}
