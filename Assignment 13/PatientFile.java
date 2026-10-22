import java.io.*;
import java.util.*;

public class PatientFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Diagnosis: ");
        String diagnosis = sc.nextLine();
        sc.close();

        File file = new File("patient.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Patient ID: " + id);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Age: " + age);
            bw.newLine();
            bw.write("Diagnosis: " + diagnosis);
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