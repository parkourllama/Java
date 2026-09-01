class Vehicle {
    String vehicleName = "Honda City";
    int vehicleValue = 1000000;
}

class CarInsurance extends Vehicle {

    void display() {
        System.out.println("Vehicle: " + super.vehicleName);
        System.out.println("Vehicle Value: " + super.vehicleValue);
        System.out.println("Insurance Type: Car Insurance");
    }
}

class InsuranceMain {
    public static void main(String[] args) {
        CarInsurance c = new CarInsurance();
        c.display();
    }
}