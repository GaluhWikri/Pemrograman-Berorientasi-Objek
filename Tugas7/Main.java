package Tugas7;


public class Main {
	    public static void main(String[] args) {
	        MyInterface[] bentukArray = new MyInterface[2];
	        bentukArray[0] = new Lingkaran();
	        bentukArray[1] = new Tabung();

	        for (MyInterface bentuk : bentukArray) {
	            bentuk.displayMessage(); // Polymorphism terjadi di sini
	        }
	    }
	}