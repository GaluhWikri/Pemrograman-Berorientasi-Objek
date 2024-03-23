package Tugas4;

public class MataKuliah {
	private String kode;
	private String nama;
	private String index;
	private int sks;
	
	//konstruktor
	public  MataKuliah(String kode, String nama, String index, int sks)
	{
		super();
		this.kode = kode ;
		this.nama = nama ;
		this.index = index;
		this.setSks(sks) ;
	}
	public double NilaiIndex()
	{
		//berdasarkan index matakuliah 
		//a = 4, ab = 3.5, b = 4 , bc = 2.5, c = 2, d = 1, e = 0
        switch (index) {
        case "a":
            return 4.0;
        case "ab":
            return 3.5;
        case "b":
            return 3.0;
        case "bc":
            return 2.5;
        case "c":
            return 2.0;
        case "d":
            return 1.0;
        case "e":
            return 0.0;
        default :
        	return 0.0;
        }
	}
	
	public String display()
	{
		return kode + " - " + nama + " - "+ index;
	}
	

	public String getKode() {
		return kode;
	}


	public void setKode(String kode) {
		this.kode = kode;
	}


	public String getNama() {
		return nama;
	}


	public void setNama(String nama) {
		this.nama = nama;
	}


	public String getIndex() {
		return index;
	}


	public void setIndex(String index) {
		this.index = index;
	}


	public int getSks() {
		return sks;
	}


	public void setSks(int sks) {
		this.sks = sks;
	}


}
