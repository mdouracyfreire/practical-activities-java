package aplication;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = input.nextInt();
        System.out.print("Enter account holder: ");
        input.nextLine();
        String holder = input.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = input.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = input.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }

        System.out.println("\nAccount data: ");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        account.deposit(input.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(input.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);
        input.close();
    }
}
