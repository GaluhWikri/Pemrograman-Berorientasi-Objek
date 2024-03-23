package Tugas4;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMataKuliah(MataKuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
        double totalBobot = 0;
        double totalSKS = 0;

        for (MataKuliah mk : daftarMatakuliah) {
            totalBobot += mk.NilaiIndex() * mk.getSks();
            totalSKS += mk.getSks();
        }
        if (totalSKS != 0) {
        	 ips = totalBobot / totalSKS;
        } else {
        	 ips = 0.0;
        }
    }
	

    // Setter & Getter for semester
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    // Setter & Getter untuk sks
    public double getIPS() {
        return ips;
    }

    public void setIPS(double ips) {
        this.ips = ips;
    }
    
	public List<MataKuliah> getDaftarMataKuliah() {
		return daftarMatakuliah;
	}

	public void setDaftarMataKuliah(List<MataKuliah> daftarMatakuliah) {
		this.daftarMatakuliah = daftarMatakuliah;
	}
	
}


