package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percetage) {
        System.out.print("\nUpdate data: "
                + name
                + ", $ "
                + String.format("%.2f", netSalary() + (grossSalary * percetage / 100)));
    }

    public String toString() {
        return "Employee: "
                + name
                + ", $ "
                + String.format("%.2f", netSalary());
    }
}
