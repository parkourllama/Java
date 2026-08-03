public class Mobile {
    String brand;
    int price;

    Mobile() {
        brand = "Unknown";
        price = 0;
    }

    Mobile(String b, int p) {
        brand = b;
        price = p;
    }

    Mobile(Mobile m) {
        brand = m.brand;
        price = m.price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", 25000);
        Mobile m2 = new Mobile(m1);

        m1.display();
        m2.display();
    }
}