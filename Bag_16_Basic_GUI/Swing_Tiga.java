package Bag_16_Basic_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swing_Tiga extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JLabel label1, label2;
    private JPanel panel1, panel2;
    private JTextField textField;

    public Swing_Tiga() {
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(6, 0));
        panel1.setBackground(Color.WHITE);

        // Meletakkan obyek label1 dan text field di panel1
        label1 = new JLabel("TEST INPUT");
        textField = new JTextField(10);
        textField.setForeground(Color.BLUE);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        panel1.add(label1, BorderLayout.LINE_START);
        panel1.add(textField, BorderLayout.CENTER);

        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.setBackground(Color.WHITE);

        // Meletakkan obyek label2 di panel2
        label2 = new JLabel(textField.getText(), JLabel.CENTER);
        label2.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel2.add(label2, BorderLayout.CENTER);

        // Meletakkan panel1 dan panel2 di frame
        getContentPane().add(panel1, BorderLayout.PAGE_START);
        getContentPane().add(panel2, BorderLayout.CENTER);

        // Menangani event actionPerformed
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                label2.setText(textField.getText());
                textField.requestFocusInWindow();
            }
        });
    }

    public static void main(String args[]) {

        // Menguji program dengan membuat obyek di metoda main
        Swing_Tiga frame = new Swing_Tiga();
        frame.setTitle("INI JUDUL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2 - frame.getSize().width / 2;
        int y = layar.height / 2 - frame.getSize().height / 2;

        frame.setLocation(x, y);

        frame.setVisible(true);
    }
}
