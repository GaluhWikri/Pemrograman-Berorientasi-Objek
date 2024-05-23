package Tugas9_1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm1 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel label;

    public HelloWorldForm1() {
        // Inisialisasi JLabel dan mengatur teks
        label = new JLabel();
        // Mengatur judul JFrame
        label.setText("Hallo dunia");
        // Menambahkan label dan button ke JFrame
        add(label);
        setTitle("Program pertama");
        // Menampilkan JFrame
        setVisible(true);
        // Mengatur ukuran JFrame
        setSize(300, 200);
    }
}

