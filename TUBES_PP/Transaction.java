package TUBES_PP;

	// Abstract class: Transaction (Abstraction)
		abstract class Transaction {
	    private String date;
	    private String description;
	    protected double amount;

	    // Constructor
	    public Transaction(String date, String description, double amount) {
	        this.date = date; // Inisialisasi atribut date
	        this.description = description; // Inisialisasi atribut description
	        this.amount = amount; // Inisialisasi atribut amount
	    }

	    // Abstract method (Polymorphism)
	    // Mendeklarasikan metode abstrak getAmount yang harus diimplementasikan oleh subclass
	    public abstract double getAmount();

	    // Metode untuk mendapatkan nilai date
	    public String getDate() {
	        return date;
	    }

	    // Metode untuk mendapatkan nilai description
	    public String getDescription() {
	        return description;
	    }

	    // Metode untuk menampilkan informasi transaksi
	    public void displayTransaction() {
	        System.out.println("Date: " + date + ", Description: " + description + ", Amount: " + getAmount());
	    }
	}
	


