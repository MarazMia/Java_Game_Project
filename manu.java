
package A_Simple_Card_Game.newpackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
public class manu {
 // public static void main(String[] args){ 
 //   public manu(){
    public Rectangle playButton=new Rectangle(420,150,100,50);
    public Rectangle helpButton=new Rectangle(420,250,100,50);
    public Rectangle quitButton=new Rectangle(420,350,100,50);
    Image image = Toolkit.getDefaultToolkit().createImage("background.jpg");
   // manu(){
    public void render(Graphics g){
        Graphics2D g2d=(Graphics2D) g;
        //int Font = 0;
        g.drawImage(image, 0, 0, null);
        Font fnt0=new Font("arial",Font.BOLD,50);
        g.setFont(fnt0);
        g.setColor(Color.blue);
        g.drawString("CARD GAMES", 1366, 768);
        
        Font fnt1=new Font("arial",Font.BOLD,30);
        g.setFont(fnt1);
        g.drawString("Play", playButton.x+19,playButton.y+30 );
        g2d.draw(playButton);
        g.drawString("Help", helpButton.x+19,playButton.y+30 );
        g2d.draw(helpButton);
        g.drawString("Quit", quitButton.x+19,playButton.y+30 );
        g2d.draw(quitButton);
    }
 //   }
}
    
