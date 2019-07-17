package A_Simple_Card_Game;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

public class GUI extends javax.swing.JFrame {

    int card_value;
    int maxxi = 0;

    Image image = Toolkit.getDefaultToolkit().createImage("Background.jpg");
    Image image1 = Toolkit.getDefaultToolkit().createImage("backside1.jpg");
    Image jicon = Toolkit.getDefaultToolkit().createImage("Icon.jpg");

    ImageIcon imghi1 = new ImageIcon("Hearts//H1.png");
    ImageIcon imghi2 = new ImageIcon("Hearts//H2.png");
    ImageIcon imghi3 = new ImageIcon("Hearts//H3.png");
    ImageIcon imghi4 = new ImageIcon("Hearts//H4.png");
    ImageIcon imghi5 = new ImageIcon("Hearts//H5.png");
    ImageIcon imghi6 = new ImageIcon("Hearts//H6.png");
    ImageIcon imghi7 = new ImageIcon("Hearts//H7.png");
    ImageIcon imghi8 = new ImageIcon("Hearts//H8.png");
    ImageIcon imghi9 = new ImageIcon("Hearts//H9.png");
    ImageIcon imghi10 = new ImageIcon("Hearts//H10.png");
    ImageIcon imghi11 = new ImageIcon("Hearts//H11.png");
    ImageIcon imghi12 = new ImageIcon("Hearts//H12.png");
    ImageIcon imghi13 = new ImageIcon("Hearts//H13.png");

    ImageIcon imgsi1 = new ImageIcon("Spades//S1.png");
    ImageIcon imgsi2 = new ImageIcon("Spades//S2.png");
    ImageIcon imgsi3 = new ImageIcon("Spades//S3.png");
    ImageIcon imgsi4 = new ImageIcon("Spades//S4.png");
    ImageIcon imgsi5 = new ImageIcon("Spades//S5.png");
    ImageIcon imgsi6 = new ImageIcon("Spades//S6.png");
    ImageIcon imgsi7 = new ImageIcon("Spades//S7.png");
    ImageIcon imgsi8 = new ImageIcon("Spades//S8.png");
    ImageIcon imgsi9 = new ImageIcon("Spades//S9.png");
    ImageIcon imgsi10 = new ImageIcon("Spades//S10.png");
    ImageIcon imgsi11 = new ImageIcon("Spades//S11.png");
    ImageIcon imgsi12 = new ImageIcon("Spades//S12.png");
    ImageIcon imgsi13 = new ImageIcon("Spades//S13.png");

    ImageIcon imgci1 = new ImageIcon("Clubs//C1.png");
    ImageIcon imgci2 = new ImageIcon("Clubs//C2.png");
    ImageIcon imgci3 = new ImageIcon("Clubs//C3.png");
    ImageIcon imgci4 = new ImageIcon("Clubs//C4.png");
    ImageIcon imgci5 = new ImageIcon("Clubs//C5.png");
    ImageIcon imgci6 = new ImageIcon("Clubs//C6.png");
    ImageIcon imgci7 = new ImageIcon("Clubs//C7.png");
    ImageIcon imgci8 = new ImageIcon("Clubs//C8.png");
    ImageIcon imgci9 = new ImageIcon("Clubs//C9.png");
    ImageIcon imgci10 = new ImageIcon("Clubs//C10.png");
    ImageIcon imgci11 = new ImageIcon("Clubs//C11.png");
    ImageIcon imgci12 = new ImageIcon("Clubs//C12.png");
    ImageIcon imgci13 = new ImageIcon("Clubs//C13.png");

    ImageIcon imgdi1 = new ImageIcon("Diamonds//D1.png");
    ImageIcon imgdi2 = new ImageIcon("Diamonds//D2.png");
    ImageIcon imgdi3 = new ImageIcon("Diamonds//D3.png");
    ImageIcon imgdi4 = new ImageIcon("Diamonds//D4.png");
    ImageIcon imgdi5 = new ImageIcon("Diamonds//D5.png");
    ImageIcon imgdi6 = new ImageIcon("Diamonds//D6.png");
    ImageIcon imgdi7 = new ImageIcon("Diamonds//D7.png");
    ImageIcon imgdi8 = new ImageIcon("Diamonds//D8.png");
    ImageIcon imgdi9 = new ImageIcon("Diamonds//D9.png");
    ImageIcon imgdi10 = new ImageIcon("Diamonds//D10.png");
    ImageIcon imgdi11 = new ImageIcon("Diamonds//D11.png");
    ImageIcon imgdi12 = new ImageIcon("Diamonds//D12.png");
    ImageIcon imgdi13 = new ImageIcon("Diamonds//D13.png");

    ImageIcon[] arrbutton = new ImageIcon[6];
    ImageIcon[] arrbutton1 = new ImageIcon[20];
    boolean[] isempty = new boolean[20];

    //games windows resulation
    int width = 1366;
    int height = 768;

    //Color bgcolor = new Color(39, 119, 20); //background color green
    Font fontcard = new Font("Times New Roman", Font.BOLD, 25);
    Font font = new Font("Times New Roman", Font.BOLD, 25);
    Font font2 = new Font("Times New Roman", Font.BOLD, 18);

    //rectengle for games board 
    int gridx = 230;
    int gridy = 200;
    int gridw = 900;
    int gridh = 300;

    //cards space and design
   /* int cardspacing = 10;
     int cardedgesofting = 10;
     int cardtw = gridw / 8;
     int cardth = gridh / 2;
     int cardaw = cardtw - 2 * cardspacing;
     int cardah = cardth - 2 * cardspacing;*/
    //players space and cards model size design
    int playergridx = 230;
    int playergridy = 520;
    int playergridw = 900;
    int playergridh = 150;

    //buttons
    JButton p1 = new JButton();
    JButton p2 = new JButton();
    JButton p3 = new JButton();
    JButton p4 = new JButton();
    JButton p5 = new JButton();
    JButton p6 = new JButton();

    ////buttons for board
    JButton t1 = new JButton();
    JButton t2 = new JButton();
    JButton t3 = new JButton();
    JButton t4 = new JButton();
    JButton t5 = new JButton();
    JButton t6 = new JButton();
    JButton t7 = new JButton();
    JButton t8 = new JButton();
    JButton t9 = new JButton();
    JButton t10 = new JButton();

    JButton a1 = new JButton();
    JButton a2 = new JButton();
    JButton a3 = new JButton();
    JButton a4 = new JButton();
    JButton a5 = new JButton();
    JButton a6 = new JButton();
    JButton a7 = new JButton();
    JButton a8 = new JButton();
    JButton a9 = new JButton();
    JButton a10 = new JButton();

    //making array list for 5 terms
    ArrayList<Cards> allCards = new ArrayList<Cards>();
    ArrayList<Cards> you = new ArrayList<Cards>();
    ArrayList<Cards> player1 = new ArrayList<Cards>();
    ArrayList<Cards> player2 = new ArrayList<Cards>();
    ArrayList<Cards> player3 = new ArrayList<Cards>();
    ArrayList<Cards> budget_cards = new ArrayList<Cards>();
    ArrayList<Cards> board_cards = new ArrayList<Cards>();

    //generating random numbers for independence distribution
    int rand = new Random().nextInt(52);

    //games frames constructor
    public GUI() {
        ////frames initial declaration
        this.setSize(width + 6, height + 29);
        this.setTitle("Red_Cuts_Balck");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setup background color
        Background board = new Background();
        this.setContentPane(board);
        this.setLayout(null);

        //adding button on the board
        p1.setBounds(playergridx + 0 * 83 + 20, playergridy + 15, 83, 120);
        p1.setBackground(Color.DARK_GRAY);
        p1.setBorder(null);
        p1.setOpaque(false);

        board.add(p1);
        p2.setBounds(playergridx + 1 * 83 + 20, playergridy + 15, 83, 120);
        p2.setBackground(Color.DARK_GRAY);
        p2.setBorder(null);
        p2.setOpaque(false);

        board.add(p2);
        p3.setBounds(playergridx + 2 * 83 + 20, playergridy + 15, 83, 120);
        p3.setBackground(Color.DARK_GRAY);
        p3.setBorder(null);
        p3.setOpaque(false);

        board.add(p3);
        p4.setBounds(playergridx + 3 * 83 + 20, playergridy + 15, 83, 120);
        p4.setBackground(Color.DARK_GRAY);
        p4.setBorder(null);
        p4.setOpaque(false);

        board.add(p4);
        p5.setBounds(playergridx + 4 * 83 + 20, playergridy + 15, 83, 120);
        p5.setBackground(Color.DARK_GRAY);
        p5.setBorder(null);
        p5.setOpaque(false);

        board.add(p5);
        p6.setBounds(playergridx + 5 * 83 + 20, playergridy + 15, 83, 120);
        p6.setBackground(Color.DARK_GRAY);
        p6.setBorder(null);
        p6.setOpaque(false);

        board.add(p6);

        t1.setBounds(gridx + 0 * 83 + 20, gridy + 15, 83, 120);
        t1.setBackground(Color.DARK_GRAY);
        t1.setBorder(null);
        t1.setOpaque(false);
        t1.setContentAreaFilled(false);
        t1.setBorderPainted(false);

        board.add(t1);
        t2.setBounds(gridx + 1 * 83 + 20, gridy + 15, 83, 120);
        t2.setBackground(Color.DARK_GRAY);
        t2.setBorder(null);
        t2.setOpaque(false);
        t2.setContentAreaFilled(false);
        t2.setBorderPainted(false);

        board.add(t2);
        t3.setBounds(gridx + 2 * 83 + 20, gridy + 15, 83, 120);
        t3.setBackground(Color.DARK_GRAY);
        t3.setBorder(null);
        t3.setOpaque(false);
        t3.setContentAreaFilled(false);
        t3.setBorderPainted(false);

        board.add(t3);
        t4.setBounds(gridx + 3 * 83 + 20, gridy + 15, 83, 120);
        t4.setBackground(Color.DARK_GRAY);
        t4.setBorder(null);
        t4.setOpaque(false);
        t4.setContentAreaFilled(false);
        t4.setBorderPainted(false);

        board.add(t4);
        t5.setBounds(gridx + 4 * 83 + 20, gridy + 15, 83, 120);
        t5.setBackground(Color.DARK_GRAY);
        t5.setBorder(null);
        t5.setOpaque(false);
        t5.setContentAreaFilled(false);
        t5.setBorderPainted(false);

        board.add(t5);
        t6.setBounds(gridx + 5 * 83 + 20, gridy + 15, 83, 120);
        t6.setBackground(Color.DARK_GRAY);
        t6.setBorder(null);
        t6.setOpaque(false);
        t6.setContentAreaFilled(false);
        t6.setBorderPainted(false);

        board.add(t6);
        t7.setBounds(gridx + 6 * 83 + 20, gridy + 15, 83, 120);
        t7.setBackground(Color.DARK_GRAY);
        t7.setBorder(null);
        t7.setOpaque(false);
        t7.setContentAreaFilled(false);
        t7.setBorderPainted(false);

        board.add(t7);
        t8.setBounds(gridx + 7 * 83 + 20, gridy + 15, 83, 120);
        t8.setBackground(Color.DARK_GRAY);
        t8.setBorder(null);
        t8.setOpaque(false);
        t8.setContentAreaFilled(false);
        t8.setBorderPainted(false);

        board.add(t8);
        t9.setBounds(gridx + 8 * 83 + 20, gridy + 15, 83, 120);
        t9.setBackground(Color.GRAY);
        t9.setBorder(null);
        t9.setOpaque(false);
        t9.setContentAreaFilled(false);
        t9.setBorderPainted(false);

        board.add(t9);
        t10.setBounds(gridx + 9 * 83 + 20, gridy + 15, 83, 120);
        t10.setBackground(Color.GRAY);
        t10.setBorder(null);
        t10.setOpaque(false);
        t10.setContentAreaFilled(false);
        t10.setBorderPainted(false);

        board.add(t10);

        a1.setBounds(gridx + 0 * 83 + 20, gridy + 15 + 130, 83, 120);
        a1.setBackground(Color.DARK_GRAY);
        a1.setVisible(true);
        a1.setBorder(null);
        a1.setOpaque(false);
        a1.setContentAreaFilled(false);
        a1.setBorderPainted(false);

        board.add(a1);
        a2.setBounds(gridx + 1 * 83 + 20, gridy + 15 + 130, 83, 120);
        a2.setBackground(Color.DARK_GRAY);
        a2.setBorder(null);
        a2.setOpaque(false);
        a2.setContentAreaFilled(false);
        a2.setBorderPainted(false);

        board.add(a2);
        a3.setBounds(gridx + 2 * 83 + 20, gridy + 15 + 130, 83, 120);
        a3.setBackground(Color.DARK_GRAY);
        a3.setBorder(null);
        a3.setOpaque(false);
        a3.setContentAreaFilled(false);
        a3.setBorderPainted(false);

        board.add(a3);
        a4.setBounds(gridx + 3 * 83 + 20, gridy + 15 + 130, 83, 120);
        a4.setBackground(Color.DARK_GRAY);
        a4.setBorder(null);
        a4.setOpaque(false);
        a4.setContentAreaFilled(false);
        a4.setBorderPainted(false);

        board.add(a4);
        a5.setBounds(gridx + 4 * 83 + 20, gridy + 15 + 130, 83, 120);
        a5.setBackground(Color.DARK_GRAY);
        a5.setBorder(null);
        a5.setOpaque(false);
        a5.setContentAreaFilled(false);
        a5.setBorderPainted(false);

        board.add(a5);
        a6.setBounds(gridx + 5 * 83 + 20, gridy + 15 + 130, 83, 120);
        a6.setBackground(Color.DARK_GRAY);
        a6.setBorder(null);
        a6.setOpaque(false);
        a6.setContentAreaFilled(false);
        a6.setBorderPainted(false);

        board.add(a6);
        a7.setBounds(gridx + 6 * 83 + 20, gridy + 15 + 130, 83, 120);
        a7.setBackground(Color.DARK_GRAY);
        a7.setBorder(null);
        a7.setOpaque(false);
        a7.setContentAreaFilled(false);
        a7.setBorderPainted(false);

        board.add(a7);
        a8.setBounds(gridx + 7 * 83 + 20, gridy + 15 + 130, 83, 120);
        a8.setBackground(Color.DARK_GRAY);
        a8.setBorder(null);
        a8.setOpaque(false);
        a8.setContentAreaFilled(false);
        a8.setBorderPainted(false);

        board.add(a8);
        a9.setBounds(gridx + 8 * 83 + 20, gridy + 15 + 130, 83, 120);
        a9.setBackground(Color.GRAY);
        a9.setBorder(null);
        a9.setOpaque(false);
        a9.setContentAreaFilled(false);
        a9.setBorderPainted(false);

        board.add(a9);
        a10.setBounds(gridx + 9 * 83 + 20, gridy + 15 + 130, 83, 120);
        a10.setBackground(Color.GRAY);
        a10.setBorder(null);
        a10.setOpaque(false);
        a10.setContentAreaFilled(false);
        a10.setBorderPainted(false);
        board.add(a10);

        //creating cards from Cards class
        String shapeS1 = null;
        int id_setter = 0;
        for (int s = 0; s < 4; s++) {
            if (s == 0) {
                shapeS1 = "Spades";
            } else if (s == 1) {
                shapeS1 = "Hearts";
            } else if (s == 2) {
                shapeS1 = "Diamonds";
            } else {
                shapeS1 = "Clubs";
            }
            for (int i = 2; i < 15; i++) {
                allCards.add(new Cards(i, shapeS1, id_setter));
                id_setter++;
            }
        }

        //randomly store cards into all terms array list 
        for (int i = 0; i < 6; i++) {
            rand = new Random().nextInt(52);
            while (true) {
                if (allCards.get(rand).cardused == false) {
                    you.add(allCards.get(rand));
                    allCards.get(rand).cardused = true;
                    break;
                } else {
                    rand = new Random().nextInt(52);
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            rand = new Random().nextInt(52);
            while (true) {
                if (allCards.get(rand).cardused == false) {
                    player1.add(allCards.get(rand));
                    allCards.get(rand).cardused = true;
                    break;
                } else {
                    rand = new Random().nextInt(52);
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            rand = new Random().nextInt(52);
            while (true) {
                if (allCards.get(rand).cardused == false) {
                    player2.add(allCards.get(rand));
                    allCards.get(rand).cardused = true;
                    break;
                } else {
                    rand = new Random().nextInt(52);
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            rand = new Random().nextInt(52);
            while (true) {
                if (allCards.get(rand).cardused == false) {
                    player3.add(allCards.get(rand));
                    allCards.get(rand).cardused = true;
                    break;
                } else {
                    rand = new Random().nextInt(52);
                }
            }
        }

        for (int i = 0; i < 24; i++) {
            rand = new Random().nextInt(52);
            while (true) {
                if (allCards.get(rand).cardused == false) {
                    budget_cards.add(allCards.get(rand));
                    allCards.get(rand).cardused = true;
                    break;
                } else {
                    rand = new Random().nextInt(52);
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            rand = new Random().nextInt(52);
            while (true) {
                if (allCards.get(rand).cardused == false) {
                    board_cards.add(allCards.get(rand));
                    allCards.get(rand).cardused = true;
                    break;
                } else {
                    rand = new Random().nextInt(52);
                }
            }
        }

        // you.sort();
        //check wheather it's working or not
        for (Cards c : you) {
            System.out.println("you have card " + c.name + " of " + c.shape + c.card_value);
        }
        for (Cards c : player1) {
            System.out.println("player1 has card " + c.name + " of " + c.shape + c.card_value);
        }
        for (Cards c : player2) {
            System.out.println("player2 has card " + c.name + " of " + c.shape + c.card_value);
        }
        for (Cards c : player3) {
            System.out.println("player3 has card " + c.name + " of " + c.shape + c.card_value);
        }
        for (Cards c : budget_cards) {
            System.out.println("budget " + c.name + " of " + c.shape + c.card_value);
        }
        for (Cards c : board_cards) {
            System.out.println("remain in board " + c.name + " of " + c.shape + c.card_value);
        }

        this.setIconImage(jicon);

        JTextField jf = new JTextField();
        jf.setBackground(Color.DARK_GRAY);
        jf.setBounds(playergridx + 280, playergridy + playergridh + 5, 80, 45);
        jf.setVisible(true);
        jf.setFont(font);
        jf.setForeground(Color.yellow);
        jf.setBorder(null);
        this.add(jf);
        
        
        JTextField jfb = new JTextField();
        jfb.setBackground(Color.DARK_GRAY);
        jfb.setBounds(0, 0, 260, 105);
        jfb.setVisible(true);
        jfb.setBackground(Color.black);
        jfb.setFont(font2);
        jfb.setForeground(Color.yellow);
        jfb.setOpaque(true);
        jfb.setBorder(null);
        this.add(jfb);
        

        for (int y = 0; y < 10; y++) {
            isempty[y] = true;
        }
        

       p1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music();
                jf.setText(" ");
                jfb.setText(" ");
                System.out.println(board_cards.size());
                if (is(you.get(0)) == true) {
                    maxx = maxi(you.get(0));
                } else {
                    board_cards.add(you.get(0));
                }
              /*  if (is(budget_cards.get(budget_cards.size() - 1)) == true) {
                    
                    maxx = maxx + maxi(budget_cards.get(budget_cards.size() - 1));
                    isempty[board_cards.size()-1]=true;
                    budget_cards.remove(budget_cards.size() - 1);
                } else {
                    board_cards.add(budget_cards.get(budget_cards.size() - 1));
                }//*/
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p1.setVisible(false);
                jfb.setText("you played "+you.get(0).name+" of "+you.get(0).shape);                
                System.out.println(maxx);
            }
        }); 

        p2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                jfb.setText(" ");
                System.out.println(board_cards.size());
                if (is(you.get(1)) == true) {
                    
                    maxx = maxi(you.get(1));
                } else {
                    board_cards.add(you.get(1));
                }
              /*  if (is(budget_cards.get(budget_cards.size() - 1)) == true) {
                    
                    maxx = maxx + maxi(budget_cards.get(budget_cards.size() - 1));
                    isempty[board_cards.size()-1]=true;
                    budget_cards.remove(budget_cards.size() - 1);
                } else {
                   
                    board_cards.add(budget_cards.get(budget_cards.size() - 1));
                }//*/
                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p2.setVisible(false);
                jfb.setText("you played "+you.get(1).name+" of "+you.get(1).shape);
                System.out.println(maxx);
            }
        });

        p3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                jfb.setText(" ");
                System.out.println(board_cards.size());
                if (is(you.get(2)) == true) {
                    
                    maxx = maxi(you.get(2));
                } else {
                    board_cards.add(you.get(2));
                }
             /*  if (is(budget_cards.get(budget_cards.size() - 1)) == true) {
                    
                    maxx = maxx + maxi(budget_cards.get(budget_cards.size() - 1));
                    isempty[board_cards.size()-1]=true;
                    budget_cards.remove(budget_cards.size() - 1);
                } else {
                    board_cards.add(budget_cards.get(budget_cards.size() - 1));
                }//*/
                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p3.setVisible(false);
                jfb.setText("you played "+you.get(2).name+" of "+you.get(2).shape);
                System.out.println(maxx);
            }
        });

        p4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                jfb.setText(" ");
                System.out.println(board_cards.size());
                if (is(you.get(3)) == true) {
                    
                    maxx = maxi(you.get(3));
                } else {
                    board_cards.add(you.get(3));
                }
              /* if (is(budget_cards.get(budget_cards.size() - 1)) == true) {
                    
                    maxx = maxx + maxi(budget_cards.get(budget_cards.size() - 1));
                    isempty[board_cards.size()-1]=true;
                    budget_cards.remove(budget_cards.size() - 1);
                } else {
                    board_cards.add(budget_cards.get(budget_cards.size() - 1));
                }//*/
                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p4.setVisible(false);
                jfb.setText("you played "+you.get(3).name+" of "+you.get(3).shape);
                System.out.println(maxx);
            }
        });

        p5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                jfb.setText(" ");
                System.out.println(board_cards.size());
                if (is(you.get(4)) == true) {
                   
                    maxx = maxi(you.get(4));
                } else {
                    board_cards.add(you.get(4));
                }
               /* if (is(budget_cards.get(budget_cards.size() - 1)) == true) {
                   
                    maxx = maxx + maxi(budget_cards.get(budget_cards.size() - 1));
                    isempty[board_cards.size()-1]=true;
                    budget_cards.remove(budget_cards.size() - 1);
                } else {
                    board_cards.add(budget_cards.get(budget_cards.size() - 1));
                }//*/
                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p5.setVisible(false);
                jfb.setText("you played "+you.get(4).name+" of "+you.get(4).shape);
                System.out.println(maxx);
            }
        });

        p6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                jfb.setText(" ");
                System.out.println(board_cards.size());
                if (is(you.get(5)) == true) {
                    
                    maxx = maxi(you.get(5));
                } else {
                    board_cards.add(you.get(5));
                }
               /*if (is(budget_cards.get(budget_cards.size() - 1)) == true) {
                    
                    maxx = maxx + maxi(budget_cards.get(budget_cards.size() - 1));
                    isempty[board_cards.size()-1]=true;
                    budget_cards.remove(budget_cards.size() - 1);
                } else {
                    board_cards.add(budget_cards.get(budget_cards.size() - 1));
                }//*/
                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p6.setVisible(false);
                jfb.setText("you played "+you.get(5).name+" of "+you.get(5).shape);
                System.out.println(maxx);
            }
        });

    }

    public class Background extends JPanel {

        public void paintComponent(Graphics g) {

            g.drawImage(image, 0, 0, null);   //background image
            g.drawImage(image1, gridx - 200, gridy + 120, null);
            g.drawImage(image1, gridw + 320, gridy + 120, null);
            g.drawImage(image1, gridw - 250, 30, null);
            g.drawImage(image1, 1000, 30, null);
            
            
            
            g.setColor(Color.DARK_GRAY);
            g.fillRect(playergridx + 185, playergridy + playergridh + 5, 170, 45);
            g.setFont(fontcard);
            g.setColor(Color.yellow);
            g.drawString("You : ", playergridx + 200, playergridy + playergridh + 38);

            g.setColor(Color.DARK_GRAY);
            g.fillRect(gridx + 585, gridy - 115, 170, 45);
            g.setFont(fontcard);
            g.setColor(Color.yellow);
            g.drawString("Budget Cards", gridx + 595, gridy - 85);

            g.setColor(Color.DARK_GRAY);
            g.fillRect(10, gridy + 20, 150, 45);
            g.setFont(fontcard);
            g.setColor(Color.yellow);
            g.drawString("Player3 : ", 20, gridy + 50);

            g.setColor(Color.DARK_GRAY);
            g.fillRect(1200, gridy + 20, 150, 45);
            g.setFont(fontcard);
            g.setColor(Color.yellow);
            g.drawString("Player1 : ", 1210, gridy + 50);

            g.setColor(Color.DARK_GRAY);
            g.fillRect(gridx + 185, gridy - 115, 170, 45);
            g.setFont(fontcard);
            g.setColor(Color.yellow);
            g.drawString("Player2 : ", gridx + 195, gridy - 85);

            

            //showing the cards on the table
            int j = 0;
            for (Cards c1 : board_cards) {

                if (j < board_cards.size()) {

                    if (c1.shape.equalsIgnoreCase("spades")) {
                        if (c1.symbol == "A") {
                            arrbutton1[j] = imgsi1;
                        }
                        if (c1.symbol == "2") {
                            arrbutton1[j] = imgsi2;
                        }
                        if (c1.symbol == "3") {
                            arrbutton1[j] = imgsi3;
                        }
                        if (c1.symbol == "4") {
                            arrbutton1[j] = imgsi4;
                        }
                        if (c1.symbol == "5") {
                            arrbutton1[j] = imgsi5;
                        }
                        if (c1.symbol == "6") {
                            arrbutton1[j] = imgsi6;
                        }
                        if (c1.symbol == "7") {
                            arrbutton1[j] = imgsi7;
                        }
                        if (c1.symbol == "8") {
                            arrbutton1[j] = imgsi8;
                        }
                        if (c1.symbol == "9") {
                            arrbutton1[j] = imgsi9;
                        }
                        if (c1.symbol == "10") {
                            arrbutton1[j] = imgsi10;
                        }
                        if (c1.symbol == "J") {
                            arrbutton1[j] = imgsi11;
                        }
                        if (c1.symbol == "Q") {
                            arrbutton1[j] = imgsi12;
                        }
                        if (c1.symbol == "K") {
                            arrbutton1[j] = imgsi13;
                        }
                    } //drawing hearts
                    else if (c1.shape.equalsIgnoreCase("Hearts")) {
                        if (c1.symbol == "A") {
                            arrbutton1[j] = imghi1;
                        }
                        if (c1.symbol == "2") {
                            arrbutton1[j] = imghi2;
                        }
                        if (c1.symbol == "3") {
                            arrbutton1[j] = imghi3;
                        }
                        if (c1.symbol == "4") {
                            arrbutton1[j] = imghi4;
                        }
                        if (c1.symbol == "5") {
                            arrbutton1[j] = imghi5;
                        }
                        if (c1.symbol == "6") {
                            arrbutton1[j] = imghi6;
                        }
                        if (c1.symbol == "7") {
                            arrbutton1[j] = imghi7;
                        }
                        if (c1.symbol == "8") {
                            arrbutton1[j] = imghi8;
                        }
                        if (c1.symbol == "9") {
                            arrbutton1[j] = imghi9;
                        }
                        if (c1.symbol == "10") {
                            arrbutton1[j] = imghi10;
                        }
                        if (c1.symbol == "J") {
                            arrbutton1[j] = imghi11;
                        }
                        if (c1.symbol == "Q") {
                            arrbutton1[j] = imghi12;
                        }
                        if (c1.symbol == "K") {
                            arrbutton1[j] = imghi13;
                        }
                    } //drawing diamonds
                    else if (c1.shape.equalsIgnoreCase("Diamonds")) {
                        if (c1.symbol == "A") {
                            arrbutton1[j] = imgdi1;
                        }
                        if (c1.symbol == "2") {
                            arrbutton1[j] = imgdi2;
                        }
                        if (c1.symbol == "3") {
                            arrbutton1[j] = imgdi3;
                        }
                        if (c1.symbol == "4") {
                            arrbutton1[j] = imgdi4;
                        }
                        if (c1.symbol == "5") {
                            arrbutton1[j] = imgdi5;
                        }
                        if (c1.symbol == "6") {
                            arrbutton1[j] = imgdi6;
                        }
                        if (c1.symbol == "7") {
                            arrbutton1[j] = imgdi7;
                        }
                        if (c1.symbol == "8") {
                            arrbutton1[j] = imgdi8;
                        }
                        if (c1.symbol == "9") {
                            arrbutton1[j] = imgdi9;
                        }
                        if (c1.symbol == "10") {
                            arrbutton1[j] = imgdi10;
                        }
                        if (c1.symbol == "J") {
                            arrbutton1[j] = imgdi11;
                        }
                        if (c1.symbol == "Q") {
                            arrbutton1[j] = imgdi12;
                        }
                        if (c1.symbol == "K") {
                            arrbutton1[j] = imgdi13;
                        }
                    } //drawing clubs
                    else {
                        if (c1.symbol == "A") {
                            arrbutton1[j] = imgci1;
                        }
                        if (c1.symbol == "2") {
                            arrbutton1[j] = imgci2;
                        }
                        if (c1.symbol == "3") {
                            arrbutton1[j] = imgci3;
                        }
                        if (c1.symbol == "4") {
                            arrbutton1[j] = imgci4;
                        }
                        if (c1.symbol == "5") {
                            arrbutton1[j] = imgci5;
                        }
                        if (c1.symbol == "6") {
                            arrbutton1[j] = imgci6;
                        }
                        if (c1.symbol == "7") {
                            arrbutton1[j] = imgci7;
                        }
                        if (c1.symbol == "8") {
                            arrbutton1[j] = imgci8;
                        }
                        if (c1.symbol == "9") {
                            arrbutton1[j] = imgci9;
                        }
                        if (c1.symbol == "10") {
                            arrbutton1[j] = imgci10;
                        }
                        if (c1.symbol == "J") {
                            arrbutton1[j] = imgci11;
                        }
                        if (c1.symbol == "Q") {
                            arrbutton1[j] = imgci12;
                        }
                        if (c1.symbol == "K") {
                            arrbutton1[j] = imgci13;
                        }
                    }
                } else {
                    break;
                }
                isempty[j] = false;
                j++;
            }

            //for you cards showing
            j = 0;
            for (Cards c1 : you) {

                //drawing spades
                if (c1.shape.equalsIgnoreCase("spades")) {
                    if (c1.symbol == "A") {
                        arrbutton[j] = imgsi1;
                    }
                    if (c1.symbol == "2") {
                        arrbutton[j] = imgsi2;
                    }
                    if (c1.symbol == "3") {
                        arrbutton[j] = imgsi3;
                    }
                    if (c1.symbol == "4") {
                        arrbutton[j] = imgsi4;
                    }
                    if (c1.symbol == "5") {
                        arrbutton[j] = imgsi5;
                    }
                    if (c1.symbol == "6") {
                        arrbutton[j] = imgsi6;
                    }
                    if (c1.symbol == "7") {
                        arrbutton[j] = imgsi7;
                    }
                    if (c1.symbol == "8") {
                        arrbutton[j] = imgsi8;
                    }
                    if (c1.symbol == "9") {
                        arrbutton[j] = imgsi9;
                    }
                    if (c1.symbol == "10") {
                        arrbutton[j] = imgsi10;
                    }
                    if (c1.symbol == "J") {
                        arrbutton[j] = imgsi11;
                    }
                    if (c1.symbol == "Q") {
                        arrbutton[j] = imgsi12;
                    }
                    if (c1.symbol == "K") {
                        arrbutton[j] = imgsi13;
                    }
                } //drawing hearts
                else if (c1.shape.equalsIgnoreCase("Hearts")) {
                    if (c1.symbol == "A") {
                        arrbutton[j] = imghi1;
                    }
                    if (c1.symbol == "2") {
                        arrbutton[j] = imghi2;
                    }
                    if (c1.symbol == "3") {
                        arrbutton[j] = imghi3;
                    }
                    if (c1.symbol == "4") {
                        arrbutton[j] = imghi4;
                    }
                    if (c1.symbol == "5") {
                        arrbutton[j] = imghi5;
                    }
                    if (c1.symbol == "6") {
                        arrbutton[j] = imghi6;
                    }
                    if (c1.symbol == "7") {
                        arrbutton[j] = imghi7;
                    }
                    if (c1.symbol == "8") {
                        arrbutton[j] = imghi8;
                    }
                    if (c1.symbol == "9") {
                        arrbutton[j] = imghi9;
                    }
                    if (c1.symbol == "10") {
                        arrbutton[j] = imghi10;
                    }
                    if (c1.symbol == "J") {
                        arrbutton[j] = imghi11;
                    }
                    if (c1.symbol == "Q") {
                        arrbutton[j] = imghi12;
                    }
                    if (c1.symbol == "K") {
                        arrbutton[j] = imghi13;
                    }
                } //drawing diamonds
                else if (c1.shape.equalsIgnoreCase("Diamonds")) {
                    if (c1.symbol == "A") {
                        arrbutton[j] = imgdi1;
                    }
                    if (c1.symbol == "2") {
                        arrbutton[j] = imgdi2;
                    }
                    if (c1.symbol == "3") {
                        arrbutton[j] = imgdi3;
                    }
                    if (c1.symbol == "4") {
                        arrbutton[j] = imgdi4;
                    }
                    if (c1.symbol == "5") {
                        arrbutton[j] = imgdi5;
                    }
                    if (c1.symbol == "6") {
                        arrbutton[j] = imgdi6;
                    }
                    if (c1.symbol == "7") {
                        arrbutton[j] = imgdi7;
                    }
                    if (c1.symbol == "8") {
                        arrbutton[j] = imgdi8;
                    }
                    if (c1.symbol == "9") {
                        arrbutton[j] = imgdi9;
                    }
                    if (c1.symbol == "10") {
                        arrbutton[j] = imgdi10;
                    }
                    if (c1.symbol == "J") {
                        arrbutton[j] = imgdi11;
                    }
                    if (c1.symbol == "Q") {
                        arrbutton[j] = imgdi12;
                    }
                    if (c1.symbol == "K") {
                        arrbutton[j] = imgdi13;
                    }
                } //drawing clubs
                else {
                    if (c1.symbol == "A") {
                        arrbutton[j] = imgci1;
                    }
                    if (c1.symbol == "2") {
                        arrbutton[j] = imgci2;
                    }
                    if (c1.symbol == "3") {
                        arrbutton[j] = imgci3;
                    }
                    if (c1.symbol == "4") {
                        arrbutton[j] = imgci4;
                    }
                    if (c1.symbol == "5") {
                        arrbutton[j] = imgci5;
                    }
                    if (c1.symbol == "6") {
                        arrbutton[j] = imgci6;
                    }
                    if (c1.symbol == "7") {
                        arrbutton[j] = imgci7;
                    }
                    if (c1.symbol == "8") {
                        arrbutton[j] = imgci8;
                    }
                    if (c1.symbol == "9") {
                        arrbutton[j] = imgci9;
                    }
                    if (c1.symbol == "10") {
                        arrbutton[j] = imgci10;
                    }
                    if (c1.symbol == "J") {
                        arrbutton[j] = imgci11;
                    }
                    if (c1.symbol == "Q") {
                        arrbutton[j] = imgci12;
                    }
                    if (c1.symbol == "K") {
                        arrbutton[j] = imgci13;
                    }
                }
                j++;
            }

            //setting up player cards into buttons as
            //this cards should be clickable..
            p1.setIcon(arrbutton[0]);
            p2.setIcon(arrbutton[1]);
            p3.setIcon(arrbutton[2]);
            p4.setIcon(arrbutton[3]);
            p5.setIcon(arrbutton[4]);
            p6.setIcon(arrbutton[5]);

            t1.setIcon(arrbutton1[0]);
            t2.setIcon(arrbutton1[1]);
            t3.setIcon(arrbutton1[2]);
            t4.setIcon(arrbutton1[3]);
            t5.setIcon(arrbutton1[4]);
            t6.setIcon(arrbutton1[5]);
            t7.setIcon(arrbutton1[6]);
            t8.setIcon(arrbutton1[7]);
            t9.setIcon(arrbutton1[8]);
            t10.setIcon(arrbutton1[9]);
            a1.setIcon(arrbutton1[10]);
            a2.setIcon(arrbutton1[11]);
            a3.setIcon(arrbutton1[12]);
            a4.setIcon(arrbutton1[13]);
            a5.setIcon(arrbutton1[14]);
            a6.setIcon(arrbutton1[15]);
            a7.setIcon(arrbutton1[16]);
            a8.setIcon(arrbutton1[17]);
            a9.setIcon(arrbutton1[18]);
            a10.setIcon(arrbutton1[19]);
            

            if(isempty[0]==false)
             t1.setIcon(arrbutton1[0]);
             else t1.setIcon(null);
             if(isempty[1]==false)
             t2.setIcon(arrbutton1[1]);
             else t2.setIcon(null);
             if(isempty[2]==false)
             t3.setIcon(arrbutton1[2]);
             else t3.setIcon(null);
             if(isempty[3]==false)
             t4.setIcon(arrbutton1[3]);
             else t4.setIcon(null);
             if(isempty[4]==false)
             t5.setIcon(arrbutton1[4]);
             else t5.setIcon(null);
             if(isempty[5]==false)
             t6.setIcon(arrbutton1[5]);
             else t6.setIcon(null);
             if(isempty[6]==false)
             t7.setIcon(arrbutton1[6]);
             else t7.setIcon(null);
             if(isempty[7]==false)
             t8.setIcon(arrbutton1[7]);
             else t8.setIcon(null);
             if(isempty[8]==false)
             t9.setIcon(arrbutton1[8]);
             else t9.setIcon(null);
             if(isempty[9]==false)
             t10.setIcon(arrbutton1[9]);
             else t10.setIcon(null);
            
            
             
             
             if(isempty[10]==false)
             a1.setIcon(arrbutton1[10]);
             else a1.setIcon(null);
             if(isempty[11]==false)
             a2.setIcon(arrbutton1[11]);
             else a2.setIcon(null);
             if(isempty[12]==false)
             a3.setIcon(arrbutton1[12]);
             else a3.setIcon(null);
             if(isempty[13]==false)
             a4.setIcon(arrbutton1[13]);
             else a4.setIcon(null);
             if(isempty[14]==false)
             a5.setIcon(arrbutton1[14]);
             else a5.setIcon(null);
             if(isempty[15]==false)
             a6.setIcon(arrbutton1[15]);
             else a6.setIcon(null);
             if(isempty[16]==false)
             a7.setIcon(arrbutton1[16]);
             else a7.setIcon(null);
             if(isempty[17]==false)
             a8.setIcon(arrbutton1[17]);
             else a8.setIcon(null);
             if(isempty[18]==false)
             a9.setIcon(arrbutton1[18]);
             else a9.setIcon(null);
             if(isempty[19]==false)
             a10.setIcon(arrbutton1[19]);
             else a10.setIcon(null);
            
           
            
            
            
            
                
               
                
            
            
        }
    }

    public boolean is(Cards crd) {
        boolean flag = false;
        int j=1;
        int s = board_cards.size();
        for (Cards c : board_cards) {
            if (crd.symbol == c.symbol) {
                flag = true;
                break;
            }
        }
        j++;
        return flag;
    }

    public int maxi(Cards crd) {
        int sum = crd.card_value, j = 0;
        for (Cards c : board_cards) {
            if (crd.symbol == c.symbol) {
                sum = sum + c.card_value;
                isempty[board_cards.size()-1]=true;
                board_cards.remove(j);
               

                isempty[j]=true;
                
                
                break;
            }
            j++;
        }
        return sum;
    }

    
    
    public void music(){
        AudioPlayer a = AudioPlayer.player;
        AudioStream b;
        AudioData d;
        ContinuousAudioDataStream c = null;
        try{
            b=new AudioStream(new FileInputStream("clicked.mp3"));
            d=b.getData();
            c=new ContinuousAudioDataStream(d);
        }catch(IOException e){
            
        }
        
    }


}
