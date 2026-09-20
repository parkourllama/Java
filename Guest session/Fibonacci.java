public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; 
        int x = 0, y = 1;

        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(x + " ");
            int next = x + y;
            x = y;
            y = next;
        }
    }
}
