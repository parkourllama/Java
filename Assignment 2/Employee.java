public class Employee 
{
    int id;
    String name;
    int age;
    double salary;

    Employee()
    {
        id=-1;
        name="New Hire";        //Default constructor
        age=0;
        salary=0.0;
    }

    Employee(int id, String name, int age, double salary)
    {
        this.id=id;
        this.name=name;
        this.age=age;               //Parameterized constructor
        this.salary=salary;
    }

    Employee(Employee e)
    {
        this.id=e.id;
        this.name=e.name;           //Copy constructor
        this.age=e.age;
        this.salary=e.salary;
    }

    void show()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("\n");
    }


public static void main(String[] args) 
    {
        System.out.println("Inside main");
        Employee e1= new Employee();
        Employee e2 = new Employee(102, "Ishan", 20, 60000);
        Employee e3 = new Employee(103 , "Sid", 101, 3);
        Employee e4 = new Employee(104, "Diwedi", 1, 10);
        Employee e5 = new Employee(e2);
        e1.show();
        e2.show();
        e3.show();
        e4.show();
        e5.show();
    }    
}