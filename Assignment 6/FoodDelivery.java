class FoodDelivery {
    String food = "Pizza";
    int quantity = 2;

    class Order {
        void displayOrder() {
            System.out.println("Food: " + food);
            System.out.println("Quantity: " + quantity);
        }
    }

    void deliveryStatus() {
        Runnable status1 = new Runnable() {
            public void run() {
                System.out.println("Order Confirmed");
            }
        };

        Runnable status2 = new Runnable() {
            public void run() {
                System.out.println("Order Out for Delivery");
            }
        };

        Runnable status3 = new Runnable() {
            public void run() {
                System.out.println("Order Delivered");
            }
        };

        status1.run();
        status2.run();
        status3.run();
    }

    public static void main(String[] args) {
        FoodDelivery f = new FoodDelivery();

        FoodDelivery.Order o = f.new Order();
        o.displayOrder();

        f.deliveryStatus();
    }
}