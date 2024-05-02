package Tugas6;

public class Menager extends Karyawan{
    private String devisi;
    
    public Menager(String nama, String alamat, String devisi) {
        super(nama, alamat);
        this.devisi = devisi;
    }
    
    public String getDevisi() {
        return devisi;
    }
}



