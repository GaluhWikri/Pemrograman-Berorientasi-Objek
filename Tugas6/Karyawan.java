package Tugas6;

public class Karyawan {
    protected String nama;
    protected String alamat;
    
    public Karyawan (String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
}

