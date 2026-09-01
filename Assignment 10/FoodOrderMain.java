abstract class FoodOrder {
    double price;

    FoodOrder(double price) {
        this.price = price;
    }

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {

    DineInOrder(double price) {
        super(price);
    }

    void calculateBill() {
        double bill = price + 50;
        System.out.println("Dine-In Bill: " + bill);
    }
}

class TakeAwayOrder extends FoodOrder {

    TakeAwayOrder(double price) {
        super(price);
    }

    void calculateBill() {
        double bill = price + 20;
        System.out.println("Takeaway Bill: " + bill);
    }
}

class FoodOrderMain {
    public static void main(String[] args) {
        DineInOrder d = new DineInOrder(500);
        TakeAwayOrder t = new TakeAwayOrder(500);

        d.calculateBill();
        t.calculateBill();
    }
}