package aplication;

import java.util.Scanner;

public class ProgramSumVectors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = input.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            B[i] = input.nextInt();
            C[i] = A[i] + B[i];
        }

        System.out.println("VALOR RESULTANTE: ");
        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }

        input.close();
    }
}
