package Bag_15_Applet;

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Dasar_Applet extends JApplet {

    private String str = "Pemograman 1";

    @Override
    public void init() {
        setBackground(Color.gray);
    }

    @Override
    public void destroy() {
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(1, 1, 300, 150);
        g.setColor(Color.red);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 48));
        g.drawString(str, 10, 80);
    }
}
