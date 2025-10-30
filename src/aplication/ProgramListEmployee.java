package aplication;

import entities.ListEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramListEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<ListEmployee> list = new ArrayList<>();

        System.out.print("How many employee will be registered? ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            int id = input.nextInt();

            while (hasId(list, id)) {
                System.out.print("Id already taken! Try again: ");
                id = input.nextInt();
            }

            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();

            ListEmployee employee = new ListEmployee(id, name, salary);
            list.add(employee);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int idEmployee = input.nextInt();

/*
        Integer pos = position(list, idEmployee);

        if (pos == null) {
            System.out.println("This id does exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = input.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
*/

        ListEmployee emp = list.stream().filter(obj -> obj.getId() == idEmployee).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = input.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println("\nList of employees: ");
        for (ListEmployee obj : list) {
            System.out.println(obj);
        }

        input.close();
    }

/*
    public static Integer position(List<ListEmployee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
*/

    public static boolean hasId(List<ListEmployee> list, int id) {
        ListEmployee emp = list.stream().filter(obj -> obj.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}