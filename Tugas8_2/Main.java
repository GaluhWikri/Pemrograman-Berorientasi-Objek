package Tugas8_2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek restoran
    	Pesanan Pesanan   = new Pesanan ();

        // Membuat objek minuman dan hidangan
        Minuman minuman = new Minuman("cimoray", 8.000);
        IceCream iceCream = new IceCream("walls Disney", 17.000);

        // Pemesanan makanan
        Pesanan.pesananmenu();

        // Menampilkan informasi makanan
        System.out.println("Nama Minuman :  " + minuman.getNama());
        System.out.println("Harga Minumamn : Rp " + minuman.getHarga());

        System.out.println("Nama IceCream : " + iceCream.getNama());
        System.out.println("harga IceCream : Rp" + iceCream.getHarga());
    }
}