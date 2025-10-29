package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPersonHeight {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();
        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + ( i + 1 ) + "a pessoa: ");
            input.nextLine();
            System.out.print("Nome: ");
            names[i] = input.nextLine();
            System.out.print("Idade: ");
            ages[i] = input.nextInt();
            System.out.print("Altura: ");
            heights[i] = input.nextDouble();
        }

        double sum = 0.0;
        int agesUnder16 = 0;

        for (int i = 0; i < n; i++) {
            sum += heights[i];

            if (ages[i] < 16) {
                agesUnder16++;
            }
        }

        double avgHeight = sum / n;
        double percentUnder16 = (agesUnder16 * 100.0) / n;
        System.out.printf("\nAltura média: %.2f", avgHeight);
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", percentUnder16);
        for (int i = 0; i < n; i++) {
            if (ages[i] < 16) {
                System.out.println(names[i]);
            }
        }

        input.close();
    }
}
