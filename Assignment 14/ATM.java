import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            if (amount <= 0 || amount > balance) {
                throw new IllegalArgumentException("Invalid withdrawal amount");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. Balance: " + balance);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Enter a numeric value");
        }
        sc.close();
    }
}