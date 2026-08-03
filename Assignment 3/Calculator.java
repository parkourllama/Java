public class Calculator {
    static int count = 0; 


    void add(int a, int b) {
        System.out.println("Integer Sum: " + (a + b));
        count++;
    }

    void add(double a, double b) {
        System.out.println("Decimal Sum: " + (a + b));
        count++;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(10, 5);       // Integer addition
        c.add(10.5, 5.5);   // Decimal addition

        System.out.println("Total Calculations: " + count);
    }
}