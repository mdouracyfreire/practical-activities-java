package aplication;

import entities.Grade;

import java.util.Locale;
import java.util.Scanner;

public class ProgramGrade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Grade grade = new Grade();

        grade.name = input.nextLine();
        grade.scoreOne = input.nextDouble();
        grade.scoreTwo= input.nextDouble();
        grade.scoreThree = input.nextDouble();

        System.out.println(grade);

        input.close();
    }
}
