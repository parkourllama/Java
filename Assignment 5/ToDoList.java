import java.util.ArrayList;
import java.util.Scanner;

class TodoList {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter task: ");
                String task = sc.nextLine();

                tasks.add(task);
                System.out.println("Task added.");

            } else if (choice == 2) {

                StringBuffer sb = new StringBuffer();

                for (int i = 0; i < tasks.size(); i++) {
                    sb.append((i + 1) + ". " + tasks.get(i) + "\n");
                }

                System.out.println(sb);

            } else if (choice == 3) {

                System.out.print("Enter task number to remove: ");
                int number = sc.nextInt();

                tasks.remove(number - 1);

                System.out.println("Task removed.");

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