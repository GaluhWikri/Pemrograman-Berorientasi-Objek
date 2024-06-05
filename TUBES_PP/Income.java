package TUBES_PP;

// Subclass: Income (Inheritance)
class Income extends Transaction {
    // Constructor
    public Income(String date, String description, double amount) {
        super(date, description, amount);
    }

    // Implement getAmount method
    // Metode ini mengembalikan nilai amount dari superclass (Transaction).
    @Override
    public double getAmount() {
        return super.amount;
    }
}
