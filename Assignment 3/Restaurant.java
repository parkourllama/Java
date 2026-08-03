public class Restaurant {
    static int totalOrders = 0;

    void bill(int amount) {
        System.out.println("Dine-in Bill: " + amount);
        totalOrders++;
    }

    void bill(int amount, int packingCharge) {
        System.out.println("Takeaway Bill: " + (amount + packingCharge));
        totalOrders++;
    }

    void bill(int amount, int packingCharge, int deliveryCharge) {
        System.out.println("Delivery Bill: " + (amount + packingCharge + deliveryCharge));
        totalOrders++;
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        r.bill(500);
        r.bill(400, 20);
        r.bill(300, 20, 50);

        System.out.println("Total Orders: " + totalOrders);
    }
}