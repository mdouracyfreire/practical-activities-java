package aplication;

import entities.Room;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRoom {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = input.nextInt();

        Room[] vect = new Room[10];

        for (int i = 0; i < n; i++) {
            System.out.println("\nRent #" + (i + 1)+ ": ");
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.next();
            System.out.print("Room: ");
            int numberRoom = input.nextInt();

            vect[numberRoom] = new Room(name, email, numberRoom);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < 10; i++) {
            if(vect[i] != null){
                System.out.print(vect[i].toString());
            }
        }

        input.close();
    }
}
