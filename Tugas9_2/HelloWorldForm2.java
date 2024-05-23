package Tugas9_2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm2 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel label;

    public HelloWorldForm2() {
        // Inisialisasi JLabel dan mengatur teks
        label = new JLabel();
        // Mengatur judul JFrame
        label.setText("Hallo dunia");
        // Menambahkan label dan button ke JFrame
        add(label);
        setTitle("Program pertama");
        // Mengatur ukuran JFrame
        setSize(600, 200);
    }
}
