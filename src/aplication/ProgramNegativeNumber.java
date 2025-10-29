package aplication;

import java.util.Scanner;

public class ProgramNegativeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = input.nextInt();

        int[] vect = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = input.nextInt();
        }

        System.out.println("\nNÚMEROS NEGATIVOS: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
    }
}
