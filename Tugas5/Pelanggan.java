package Tugas5;

import java.util.ArrayList;
import java.util.List;

public class Pelanggan {
    private int id;
    private String nama;
    private String alamat;
    private List<Transaksi> transaksiList;

    public Pelanggan(int id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.transaksiList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void tambahTransaksi(Transaksi transaksi) {
        transaksiList.add(transaksi);
    }

    public List<Transaksi> getTransaksiList() {
        return transaksiList;
    }
}