package TUBES_PP;

// Subclass: Expense (Inheritance)
class Expense extends Transaction {
    // Constructor
    public Expense(String date, String description, double amount) {
        super(date, description, amount);
    }

    // Implement getAmount method
    // Metode ini mengembalikan nilai amount dari superclass (Transaction) dengan nilai negatif.
    // Karena pengeluaran (Expense) biasanya dicatat sebagai nilai negatif.
    @Override
    public double getAmount() {
        return -super.amount; // Negative amount for expenses
    }
}
