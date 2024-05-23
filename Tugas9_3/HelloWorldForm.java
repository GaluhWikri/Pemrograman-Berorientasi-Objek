package Tugas9_3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldForm extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel label;
    private JButton button;

    public HelloWorldForm() {
        // Inisialisasi JLabel dan mengatur teks
        label = new JLabel("Hello World!");

        // Inisialisasi JButton dan mengatur teks
        button = new JButton("Klik me");
        button.addActionListener(this);

        
        // Menambahkan label dan button ke JFrame
        setLayout(new GridLayout(2,1));
        add(label);
        add(button);

        // Mengatur judul JFrame
        setTitle("My First Program");

        // Menampilkan JFrame
        setVisible(true);
        
        // Mengatur ukuran JFrame
        setSize(300, 200);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Mengubah teks label saat tombol diklik
        label.setText("halo dunia");
    }
}

