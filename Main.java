import java.util.Scanner;

class Employee {
    double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    double basePay;
    double bonus;

    FullTimeEmployee(double basePay, double bonus) {
        this.basePay = basePay;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basePay + bonus;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;

    PartTimeEmployee(double hourlyRate, double hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate*hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validStatement = true;

        do {
            System.out.print("Enter employee type (full-time / part-time): ");
            String employeeType = sc.nextLine();
            if (employeeType.equalsIgnoreCase("full-time")) {
                System.out.print("Enter base pay: ");
                double basePay = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter bonus: ");
                double bonus = sc.nextDouble();
                sc.nextLine();

                FullTimeEmployee f1 = new FullTimeEmployee(basePay, bonus);

                System.out.println("Monthly Salary: $" + f1.calculateSalary());

            } else if (employeeType.equalsIgnoreCase("part-time")) {
                System.out.print("Enter hourly rate: ");
                double hourlyRate = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter hours worked: ");
                double hoursWorked = sc.nextDouble();
                sc.nextLine();

                PartTimeEmployee p1 = new PartTimeEmployee(hourlyRate, hoursWorked);

                System.out.println("Monthly Salary: $" + p1.calculateSalary());
            } else {
                validStatement = false;

                System.out.println("Invalid statement please try again.");
            }
        } while(validStatement == false);
    }
}