package Tugas9_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JTextField text1;
    private JTextField text2;
    private JButton Button;

    public Kalkulator() {
        // Inisialisasi komponen
        text1 = new JTextField();
        text2 = new JTextField();
        Button = new JButton("Jumlah");

        // Menambahkan action listener ke tombol
        Button.addActionListener(this);

        // Mengatur layout dan menambahkan komponen ke JFrame
        setLayout(new GridLayout(3, 7));
        add(text1);
        add(text2);
        add(Button);

        // Mengatur ukuran JFrame
        setSize(300, 200);

        // Menampilkan JFrame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Mengambil nilai dari text field dan mengkonversinya ke integer
            int num1 = Integer.parseInt(text1.getText());
            int num2 = Integer.parseInt(text2.getText());

            // Menjumlahkan kedua angka
            int sum = num1 + num2;

            // Menampilkan hasil penjumlahan menggunakan JOptionPane
            JOptionPane.showMessageDialog(this, "Jumlah: " + sum, "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            // Menampilkan pesan error jika input selain angka tidak valid
            JOptionPane.showMessageDialog(this, "Silakan masukkan angka yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
