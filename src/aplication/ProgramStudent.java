package aplication;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = input.nextInt();
        Student[] vect = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            input.nextLine();
            String name = input.nextLine();
            double firstScore = input.nextDouble();
            double secondScore = input.nextDouble();
            vect[i] = new Student(name, firstScore, secondScore);
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].avarage() >= 6.0) {
                System.out.println(vect[i].getName());
            }
        }

        input.close();
    }
}
