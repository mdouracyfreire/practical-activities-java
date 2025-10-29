package aplication;

import entities.PersonData;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPersonData {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();
        PersonData[] vect = new PersonData[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) +"a pessoa: ");
            double height = input.nextDouble();
            System.out.print("Gênero da " + (i + 1) +"a pessoa: ");
            char gender = input.next().charAt(0);
            vect[i] = new PersonData(gender, height);
        }

        double greaterHeight = 0.0;
        double shorterHeight = vect[0].getHeight();
        double sumHeightWomen = 0.0;
        int sumQuantWomen = 0;
        int sumQuantMen = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getHeight() > greaterHeight) {
                greaterHeight = vect[i].getHeight();
            }

            if (vect[i].getHeight() < shorterHeight) {
                shorterHeight = vect[i].getHeight();
            }

            if (vect[i].getGender() == 'F') {
                sumHeightWomen += vect[i].getHeight();
                sumQuantWomen++;
            }
            else {
                sumQuantMen++;
            }
        }

        double avgHeightWomen = sumHeightWomen / sumQuantWomen;

        System.out.printf("Menos altura: %.2f%n", shorterHeight);
        System.out.printf("Maior altura: %.2f%n", greaterHeight);
        System.out.printf("Média das alturas das mulheres: %.2f%n", avgHeightWomen);
        System.out.print("Número de homens: " + sumQuantMen);

        input.close();
    }
}
