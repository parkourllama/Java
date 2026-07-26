class Calc
{
    int x, y;

    int add(int a, int b)
    {
        x = a;
        y = b;
        return x + y;

    }

    double add(double a, double b)
    {
        x = (int)a;
        y = (int)b;
        return x + y;
    }
}


public class OverCalc 
{
    public static void main(String[] args) 
    {
        Calc c = new Calc();
        System.out.println("Sum : " + c.add(10, 20));
        System.out.println("Sum : " + c.add(10.5, 20.5));
    }
}
