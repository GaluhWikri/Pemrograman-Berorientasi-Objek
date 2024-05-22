package Tugas8_1;

public class InterfaceMain {
	public static void main(String[]args) {
		KartuElektronik kartu = new KartuElektronik ("IF11", "123");
		System.out.println("Otentikasi : " + kartu.otentikasi("123"));
	}
}
