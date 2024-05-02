package Tugas5;

import java.util.Date;

public class Transaksi {
    private int id;
    private double total;
    private Date tanggal;

    public Transaksi(int id, double total, Date tanggal) {
        this.id = id;
        this.total = total;
        this.tanggal = tanggal;
    }

    public int getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public Date getTanggal() {
        return tanggal;
    }
}
