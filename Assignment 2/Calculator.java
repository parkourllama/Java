public class Calculator 
{
    int num1=10;
    int num2=5;
    
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
        c.add();
        c.subtract();
        c.multiply();
        c.divide();
    }
    
    void add()
    {
        System.out.print("Sum is: ");
        System.out.println(num1+num2);
    }

    void subtract()
    {
        System.out.print("Difference is: ");
        System.out.println(num1-num2);
    }

    void multiply()
    {
        System.out.print("Product is: ");
        System.out.println(num1*num2);
    }

    void divide()
    {
        System.out.print("Quotient is: ");
        System.out.println(num1/num2);
    }








}
