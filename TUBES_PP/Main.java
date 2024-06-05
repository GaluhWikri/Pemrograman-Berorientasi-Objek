package TUBES_PP;

public class Main {
    public static void main(String[] args) {
        // Create instances of Income and Expense
        Transaction salary = new Income("2024-05-01", "Salary", 5000.00);
        Transaction rent = new Expense("2024-05-03", "Rent", 1500.00);
        Transaction groceries = new Expense("2024-05-05", "Groceries", 200.00);

        // Display transactions
        salary.displayTransaction(); // Output: Date: 2024-05-01, Description: Salary, Amount: 5000.0
        rent.displayTransaction();   // Output: Date: 2024-05-03, Description: Rent, Amount: -1500.0
        groceries.displayTransaction(); // Output: Date: 2024-05-05, Description: Groceries, Amount: -200.0

        // Calculate and display the balance
        double balance = salary.getAmount() + rent.getAmount() + groceries.getAmount();
        System.out.println("Current Balance: $" + balance); // Output: Current Balance: 3300.0
    }
}	