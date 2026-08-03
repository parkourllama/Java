public class Student {
    String name;
    int rollNo;

    Student() {
        name = "Default";
        rollNo = -1;
    }

    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul", 101);

        s1.display();
        s2.display();
    }
}