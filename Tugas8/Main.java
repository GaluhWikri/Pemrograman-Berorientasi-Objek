package Tugas8;

public class Main {
    public static void main(String[] args) {
        // Create a Lingkaran object with jari-jari 10
        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("Lingkaran:");
        System.out.println("Jari-jari: " + lingkaran.getJari2());
        System.out.println("Luas: " + lingkaran.luas());

        // Create a Tabung object with jari-jari 10 and tinggi 5
        Tabung tabung = new Tabung(10, 5);
        System.out.println("\nTabung:");
        System.out.println("Jari-jari: " + tabung.getJari2());
        System.out.println("Tinggi: " + tabung.getTinggi());
        System.out.println("Luas permukaan: " + tabung.luas());
    }
}

