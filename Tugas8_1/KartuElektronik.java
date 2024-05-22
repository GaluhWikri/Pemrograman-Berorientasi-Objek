package Tugas8_1;

public class KartuElektronik {
	private String kodebank;
	private String pin;
	
	public KartuElektronik(String kodebank, String pin) {
		super ();
		this.setKodebank(kodebank);
		this.setPin(pin);
	}
	
	public boolean otentikasi(String pinInput) {
		if (pin.equals(pinInput))
			return true;
		else 
			return false;
	}
	
	public String encode(String pin) {
		return null;
	}

	public String getKodebank() {
		return kodebank;
	}

	public void setKodebank(String kodebank) {
		this.kodebank = kodebank;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
}
