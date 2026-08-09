import java.util.ArrayList;
import java.util.Scanner;

class Registration {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Remove Course");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter course name: ");
                String course = sc.nextLine();

                courses.add(course);
                System.out.println("Course added.");

            } else if (choice == 2) {

                StringBuffer sb = new StringBuffer();

                for (int i = 0; i < courses.size(); i++) {
                    sb.append((i + 1) + ". " + courses.get(i) + "\n");
                }

                System.out.println("Registered Courses:");
                System.out.println(sb);

            } else if (choice == 3) {

                System.out.print("Enter course number to remove: ");
                int number = sc.nextInt();

                courses.remove(number - 1);

                System.out.println("Course removed.");

            } else if (choice == 4) {

                System.out.println("Program ended.");
                break;

            } else {

                System.out.println("Wrong choice.");
            }
        }

        sc.close();
    }
}
