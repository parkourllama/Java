interface MyPrintable {
    void print();
}

class PrintableStudent implements MyPrintable {
    String name = "Rahul";

    public void print() {
        System.out.println("Student Name: " + name);
    }
}

class PrintableEmployee implements MyPrintable {
    String name = "Amit";

    public void print() {
        System.out.println("Employee Name: " + name);
    }
}

public class PrintableMain {
    public static void main(String[] args) {
        PrintableStudent s = new PrintableStudent();
        PrintableEmployee e = new PrintableEmployee();

        s.print();
        e.print();
    }
}