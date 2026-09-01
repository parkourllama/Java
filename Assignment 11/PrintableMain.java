interface Printable {
    void print();
}

class Student implements Printable {
    String name = "Rahul";

    public void print() {
        System.out.println("Student Name: " + name);
    }
}

class Employee implements Printable {
    String name = "Amit";

    public void print() {
        System.out.println("Employee Name: " + name);
    }
}

public class PrintableMain {
    public static void main(String[] args) {
        Student s = new Student();
        Employee e = new Employee();

        s.print();
        e.print();
    }
}