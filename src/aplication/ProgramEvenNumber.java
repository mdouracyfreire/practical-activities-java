package aplication;

import java.util.Scanner;

public class ProgramEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = input.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite umn número: ");
            vect[i] = input.nextInt();
        }

        int even = 0;

        System.out.println("\nNÚMEROS PARES: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d  ", vect[i]);
                even++;
            }
        }

        System.out.print("\n\nQUANTIDADE DE PARES = " + even);

        input.close();
    }
}
