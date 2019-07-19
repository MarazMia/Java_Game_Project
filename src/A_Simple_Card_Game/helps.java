package A_Simple_Card_Game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class helps extends JFrame {

    Image image2 = Toolkit.getDefaultToolkit().createImage("hlp1.jpg");
    Image image1 = Toolkit.getDefaultToolkit().createImage("Icon.jpg");

    helps() {

        this.setBounds(200, 150, 1000, 600);
        this.setTitle("Red_Cuts_Balck");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        pnt p = new pnt();
        this.setContentPane(p);
        this.setLayout(null);
        this.setIconImage(image1);
    }

    class pnt extends JPanel {

        public void paintComponent(Graphics g) {

            g.drawImage(image2, 0, 0, null);

        }
    }
}
