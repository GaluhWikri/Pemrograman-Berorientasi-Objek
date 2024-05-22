package Tugas8_2;

public abstract class MenuPesanan{
    private String nama;
    private double harga;

    public MenuPesanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}