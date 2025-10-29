package aplication;

import entities.OlderPerson;

import java.util.Scanner;

public class ProgramOlderPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = input.nextInt();
        OlderPerson[] vect = new OlderPerson[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            input.nextLine();
            System.out.print("Nome: ");
            String name = input.nextLine();
            System.out.print("Idade: ");
            int age = input.nextInt();
            vect[i] = new OlderPerson(name, age);
        }

        int olderAge = 0;
        int olderAgePosition = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() > olderAge) {
                olderAge = vect[i].getAge();
                olderAgePosition = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + vect[olderAgePosition].getName());

        input.close();
    }
}
