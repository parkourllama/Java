class BankAccount {
    final int accountNumber = 123456;
    String name = "Rahul";
    double balance = 5000;

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

class BankMain {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.display();
    }
}