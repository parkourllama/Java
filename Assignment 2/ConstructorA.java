class Student
{
    int age;
    String name;
    int prn;
    String email;
    boolean isAlive;

    Student()
    {
        System.out.println("Inside constructor");
        age=10;
        name="John";
        prn=0;
        email="john@example.com";
        isAlive=true;
    }

    void show()
    {
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
        System.out.println("PRN: "+prn);
        System.out.println("Email: "+email);
        System.out.println("Is Alive: "+isAlive);
        System.out.println("\n");
    }
}


public class ConstructorA 
{
    public static void main(String[] args) 
    {
        System.out.println("Inside main");
        Student s1= new Student();
        System.out.println("Student object is created!\n");
        s1.age = 101;
        s1.name = "Sid";
        s1.email = "sid@mail.com";
        s1.isAlive = false;
        s1.prn = 047;
        s1.show();
        Student s2 = new Student();
        s2.show();
    }    
}
