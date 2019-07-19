package A_Simple_Card_Game;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Main implements Runnable {

    GUI gui = new GUI();
    manu mn = new manu();
    helps hp = new helps();

    public static void main(String[] args) {
        new Thread(new Main()).start();
    }

    @Override
    public void run() {
        while (true) {

            mn.repaint();
            gui.repaint();
            hp.repaint();
            if (mn.a == true) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(manu.class.getName()).log(Level.SEVERE, null, ex);
                }
                gui.setVisible(true);
                mn.a = false;
            }
            if (mn.c == true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(manu.class.getName()).log(Level.SEVERE, null, ex);
                }
                mn.setVisible(false);
                mn.dispose();
                System.exit(0);
            }
            if (mn.b == true) {
                hp.setVisible(true);
                
                mn.b = false;
            }
        }
    }
}
