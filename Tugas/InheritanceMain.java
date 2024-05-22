package Tugas;

public class InheritanceMain {
    public static void main(String[] args) {
        Barista barista = new Barista("Galuh Wikri", "Bandung", "galuhwikri@gmail.com");
        Menager menager = new Menager("Galuh Juga", "Bandung", "Menager");

        System.out.println("Data menager ");
        System.out.println("Nama : " + menager.getNama());
        System.out.println("Alamat : " + menager.getAlamat());
        System.out.println("Devisi : " + menager.getDevisi());
        
        System.out.println("\nData  Barista");
        System.out.println("Nama : " + barista.getNama());
        System.out.println("alamat : " + barista.getAlamat());
        System.out.println("Email : " + barista.getEmail());
        
    }
}
