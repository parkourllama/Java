import student.Student;
import faculty.Faculty;

public class CollegeDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul Sharma", 101, "Computer Engineering");
        s1.displayStudent();

        System.out.println();

        Faculty f1 = new Faculty("Dr. A. Kulkarni", "Computer Engineering", "Java Programming");
        f1.displayFaculty();
    }
}