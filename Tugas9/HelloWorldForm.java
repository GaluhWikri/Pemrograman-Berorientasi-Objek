package Tugas9;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldForm extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel label;
    private JButton button;

    public HelloWorldForm() {
        // Inisialisasi JLabel dan mengatur teks
        label = new JLabel("Hello World!", JLabel.CENTER);

        // Inisialisasi JButton dan mengatur teks
        button = new JButton("Klik me");
        button.addActionListener(this);

        // Menambahkan label dan button ke JFrame
        add(label, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        // Mengatur judul JFrame
        setTitle("My First Program");

        // Mengatur ukuran JFrame
        setSize(300, 200);

        // Menampilkan JFrame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Mengubah teks label saat tombol diklik
        label.setText("Saya menggunakan Event.");
    }
}
