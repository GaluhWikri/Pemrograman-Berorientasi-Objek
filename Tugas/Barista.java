package Tugas;

public class Barista extends Karyawan {
    private String email;
    
    public Barista(String nama, String alamat, String email) 
    {
        super(nama, alamat);
        this.email = email;
    }  
    public String getEmail() {
        return email;
    }
	public void setEmail(String email) {
		this.email = email;
	}
}
	

