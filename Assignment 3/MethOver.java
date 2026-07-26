class MethOverA {
    static int count;
    int a, b;

    MethOverA() {
        System.out.println("Inside default constructor");
        a = 10;
        b = 20;
        count++;
    }

    MethOverA(int x, int y) {
        System.out.println("Inside parameterized constructor");
        a = x;
        b = y;
        count++;
    }

    static void countShow() {
        System.out.println("Total number of objects created: " + count);
    }

    //Version 1
    void show()
    {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

    //Version 2
    void show(int x, int y)
    {
        System.out.println("Value of a: " + x);
        System.out.println("Value of b: " + y);
    }

    //Version 3
    void show(int x)
    {
        System.out.println("Value of a: " + x);
    }
}

public class MethOver {
    public static void main(String[] args) {
        MethOverA m1 = new MethOverA();
        MethOverA.countShow();

        MethOverA m2 = new MethOverA(67, 69);
        MethOverA.countShow();

        m1.show();
        m2.show(m2.a, m2.b);

        MethOverA m3 = new MethOverA(100, 200);
        m3.show(m3.a);
    }
}
