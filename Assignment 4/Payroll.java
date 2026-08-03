import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        Integer salary = Integer.valueOf(sc.nextLine());

        System.out.print("Enter Bonus: ");
        Integer bonus = Integer.valueOf(sc.nextLine());

        if (salary > 0) {
            int netSalary = salary + bonus;

            System.out.println("Employee ID: " + id);
            System.out.println("Net Salary: " + netSalary);
        } else {
            System.out.println("Invalid Salary");
        }

        sc.close();
    }
}
