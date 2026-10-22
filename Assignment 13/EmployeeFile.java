import java.io.*;
import java.util.*;

public class EmployeeFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.close();

        File file = new File("employee.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("ID: " + id);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Salary: " + salary);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}