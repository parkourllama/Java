class Employee {
    String name = "Rahul";
    int salary = 30000;
}

class Manager extends Employee {
    String name = "Amit";

    void display() {
        System.out.println("Employee Name: " + super.name);
        System.out.println("Employee Salary: " + super.salary);
        System.out.println("Manager Name: " + name);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
    }
}