package Tugas8;

public class Lingkaran extends Bentuk {
    public Lingkaran(int jari2) {
    	super(jari2);
    }

    /*
     * D: PHI*r*r
     */

    @Override
    public double luas() {
        return PHI*jari2*jari2;
    }
}
