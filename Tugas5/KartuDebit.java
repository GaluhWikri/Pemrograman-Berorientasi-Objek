package Tugas5;

import java.util.Scanner;

public class KartuDebit {

	    private String kodeBank;
	    private String noRekening;
	    private String pin;
	    private boolean valid;

	    public KartuDebit(String kodeBank, String noRekening, String pin) {
	        this.kodeBank = kodeBank;
	        this.noRekening = noRekening;
	        this.pin = pin;
	        this.valid = true;
	    }
	    

	    // Fungsi untuk mengubah PIN
	    public void ubahPin() {
	        System.out.println("Masukkan PIN lama:");
	        try (Scanner scan = new Scanner(System.in)) {
				String pinLama = scan.next();
				if (pinLama.equals(pin)) {
				    System.out.println("Masukkan PIN baru:");
				    String pinBaru = scan.next();
				    System.out.println("Konfirmasi PIN baru:");
				    String konfirmasiPinBaru = scan.next();
				    if (pinBaru.equals(konfirmasiPinBaru)) {
				        pin = pinBaru;
				        System.out.println("PIN berhasil diubah.");
				    } else {
				        System.out.println("PIN baru dan konfirmasi PIN tidak cocok.");
				    }
				} else {
				    System.out.println("PIN lama tidak cocok.");
				}
			}
	    }

	    public String getKodeBank() {
	        return kodeBank;
	    }

	    public String getNoRekening() {
	        return noRekening;
	    }

	    public String getPin() {
	        return pin;
	    }

	    public boolean isValid() {
	        return valid;
	    }
	}
	

