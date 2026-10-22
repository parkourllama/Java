package faculty;

public class Faculty {
    String name;
    String department;
    String subject;

    public Faculty(String name, String department, String subject) {
        this.name = name;
        this.department = department;
        this.subject = subject;
    }

    public void displayFaculty() {
        System.out.println("---- Faculty Details ----");
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Subject    : " + subject);
    }
}