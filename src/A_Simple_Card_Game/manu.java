package A_Simple_Card_Game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class manu extends JFrame {

    GUI gui = new GUI();
    boolean a = false;
    boolean b = false;
    boolean c = false;

    Font fnt0 = new Font("arial", Font.BOLD, 50);
    Font fnt = new Font("arial", Font.BOLD, 25);
    Font fnt1 = new Font("arial", Font.BOLD, 15);

    public JButton playButton = new JButton();
    public JButton helpButton = new JButton();
    public JButton quitButton = new JButton();
    Image image = Toolkit.getDefaultToolkit().createImage("Background.jpg");
    Image image1 = Toolkit.getDefaultToolkit().createImage("Icon.jpg");
    
    

    manu() {

        this.setSize(1375, 780);
        this.setTitle("Red_Cuts_Balck");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        playButton.setBackground(Color.MAGENTA);
        playButton.setBounds(420, 150, 100, 50);
        playButton.setVisible(true);
        playButton.setText("play");
        playButton.setFont(fnt);
        playButton.setBorderPainted(false);

        helpButton.setBackground(Color.CYAN);
        helpButton.setBounds(420, 250, 100, 50);
        helpButton.setVisible(true);
        helpButton.setText("help");
        helpButton.setFont(fnt);
        helpButton.setBorderPainted(false);

        quitButton.setBackground(Color.red);
        quitButton.setBounds(420, 350, 100, 50);
        quitButton.setVisible(true);
        quitButton.setFont(fnt);
        quitButton.setText("quit");
        quitButton.setBorderPainted(false);

        startmenue board = new startmenue();
        this.setContentPane(board);
        this.setLayout(null);

        board.add(playButton);
        board.add(helpButton);
        board.add(quitButton);

        this.setIconImage(image1);

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = true;

                music("shuffle.wav");

            }

        });

        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                b = true;

                
            }

        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c = true;

            }

        });

    }

    public class startmenue extends JPanel {

        public void paintComponent(Graphics g) {

            g.drawImage(image, 0, 0, null);
            g.setFont(fnt0);
            g.setColor(Color.green);
            g.drawString("Red Cuts Black", 500, 100);

        }
    }
    
    

    public void music(String soundName) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
}
