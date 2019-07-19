package A_Simple_Card_Game;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

public class GUI extends javax.swing.JFrame {

    int card_value;
    int maxxi = 0;
    int compscore = 0;
    int summ = 0;

    String n = null;
    String s = null;

    Image image = Toolkit.getDefaultToolkit().createImage("Background.jpg");
    Image image3 = Toolkit.getDefaultToolkit().createImage("table1.jpg");
    Image image2 = Toolkit.getDefaultToolkit().createImage("Background33.jpg");
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

    ImageIcon[] arrbutton = new ImageIcon[26];
    ImageIcon[] arrbutton1 = new ImageIcon[10];
    boolean[] isempty = new boolean[26];

    //games windows resulation
    int width = 1366;
    int height = 768;

    //Color bgcolor = new Color(39, 119, 20); //background color green
    Font fontcard = new Font("Times New Roman", Font.BOLD, 25);
    Font font = new Font("Times New Roman", Font.BOLD, 25);
    Font dont = new Font("Times New Roman", Font.BOLD, 120);
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
    int playergridx = 115;
    int playergridy = 420;
    int playergridxx = 250;
    int playergridyy = 95;
    int playergridw = 900;
    int playergridh = 150;

    //buttons
    JButton p1 = new JButton();
    JButton p2 = new JButton();
    JButton p3 = new JButton();
    JButton p4 = new JButton();
    JButton p5 = new JButton();
    JButton p6 = new JButton();

    JButton p7 = new JButton();
    JButton p8 = new JButton();
    JButton p9 = new JButton();
    JButton p10 = new JButton();
    JButton p11 = new JButton();
    JButton p12 = new JButton();
    JButton p13 = new JButton();

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
    JButton t11 = new JButton();
    JButton t12 = new JButton();
    JButton t13 = new JButton();

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

    JTextField jfb = new JTextField();
    JTextField jfc = new JTextField();
    JTextField jf = new JTextField();

    //making array list for 5 terms
    ArrayList<Cards> allCards = new ArrayList<Cards>();
    ArrayList<Cards> you = new ArrayList<Cards>();
    ArrayList<Cards> computer = new ArrayList<Cards>();
    ArrayList<Cards> board_cards = new ArrayList<Cards>();

    //generating random numbers for independence distribution
    int rand = new Random().nextInt(52);

    //games frames constructor
    public GUI() {
        ////frames initial declaration
        this.setSize(width + 6, height + 29);
        this.setTitle("Red_Cuts_Balck");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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

        //adding button on the board
        p7.setBounds(playergridx + 6 * 83 + 20, playergridy + 15, 83, 120);
        p7.setBackground(Color.DARK_GRAY);
        p7.setBorder(null);
        p7.setOpaque(false);

        board.add(p7);
        p8.setBounds(playergridx + 7 * 83 + 20, playergridy + 15, 83, 120);
        p8.setBackground(Color.DARK_GRAY);
        p8.setBorder(null);
        p8.setOpaque(false);

        board.add(p8);
        p9.setBounds(playergridx + 8 * 83 + 20, playergridy + 15, 83, 120);
        p9.setBackground(Color.DARK_GRAY);
        p9.setBorder(null);
        p9.setOpaque(false);

        board.add(p9);
        p10.setBounds(playergridx + 9 * 83 + 20, playergridy + 15, 83, 120);
        p10.setBackground(Color.DARK_GRAY);
        p10.setBorder(null);
        p10.setOpaque(false);

        board.add(p10);
        p11.setBounds(playergridx + 10 * 83 + 20, playergridy + 15, 83, 120);
        p11.setBackground(Color.DARK_GRAY);
        p11.setBorder(null);
        p11.setOpaque(false);

        board.add(p11);
        p12.setBounds(playergridx + 11 * 83 + 20, playergridy + 15, 83, 120);
        p12.setBackground(Color.DARK_GRAY);
        p12.setBorder(null);
        p12.setOpaque(false);

        board.add(p12);
        p13.setBounds(playergridx + 12 * 83 + 20, playergridy + 15, 83, 120);
        p13.setBackground(Color.DARK_GRAY);
        p13.setBorder(null);
        p13.setOpaque(false);

        board.add(p13);

        t1.setBounds(playergridx + 0 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t1.setBackground(Color.DARK_GRAY);
        t1.setBorder(null);
        t1.setOpaque(false);
        t1.setContentAreaFilled(false);
        t1.setBorderPainted(false);

        board.add(t1);
        t2.setBounds(playergridx + 1 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t2.setBackground(Color.DARK_GRAY);
        t2.setBorder(null);
        t2.setOpaque(false);
        t2.setContentAreaFilled(false);
        t2.setBorderPainted(false);

        board.add(t2);
        t3.setBounds(playergridx + 2 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t3.setBackground(Color.DARK_GRAY);
        t3.setBorder(null);
        t3.setOpaque(false);
        t3.setContentAreaFilled(false);
        t3.setBorderPainted(false);

        board.add(t3);
        t4.setBounds(playergridx + 3 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t4.setBackground(Color.DARK_GRAY);
        t4.setBorder(null);
        t4.setOpaque(false);
        t4.setContentAreaFilled(false);
        t4.setBorderPainted(false);

        board.add(t4);
        t5.setBounds(playergridx + 4 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t5.setBackground(Color.DARK_GRAY);
        t5.setBorder(null);
        t5.setOpaque(false);
        t5.setContentAreaFilled(false);
        t5.setBorderPainted(false);

        board.add(t5);
        t6.setBounds(playergridx + 5 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t6.setBackground(Color.DARK_GRAY);
        t6.setBorder(null);
        t6.setOpaque(false);
        t6.setContentAreaFilled(false);
        t6.setBorderPainted(false);

        board.add(t6);
        t7.setBounds(playergridx + 6 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t7.setBackground(Color.DARK_GRAY);
        t7.setBorder(null);
        t7.setOpaque(false);
        t7.setContentAreaFilled(false);
        t7.setBorderPainted(false);

        board.add(t7);
        t8.setBounds(playergridx + 7 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t8.setBackground(Color.DARK_GRAY);
        t8.setBorder(null);
        t8.setOpaque(false);
        t8.setContentAreaFilled(false);
        t8.setBorderPainted(false);

        board.add(t8);
        t9.setBounds(playergridx + 8 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t9.setBackground(Color.GRAY);
        t9.setBorder(null);
        t9.setOpaque(false);
        t9.setContentAreaFilled(false);
        t9.setBorderPainted(false);

        board.add(t9);
        t10.setBounds(playergridx + 9 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t10.setBackground(Color.GRAY);
        t10.setBorder(null);
        t10.setOpaque(false);
        t10.setContentAreaFilled(false);
        t10.setBorderPainted(false);

        board.add(t10);

        t11.setBounds(playergridx + 10 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t11.setBackground(Color.GRAY);
        t11.setBorder(null);
        t11.setOpaque(false);
        t11.setContentAreaFilled(false);
        t11.setBorderPainted(false);

        board.add(t11);

        t12.setBounds(playergridx + 11 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t12.setBackground(Color.GRAY);
        t12.setBorder(null);
        t12.setOpaque(false);
        t12.setContentAreaFilled(false);
        t12.setBorderPainted(false);

        board.add(t12);
        t13.setBounds(playergridx + 12 * 83 + 20, playergridy + 15 + 125, 83, 120);
        t13.setBackground(Color.GRAY);
        t13.setBorder(null);
        t13.setOpaque(false);
        t13.setContentAreaFilled(false);
        t13.setBorderPainted(false);

        board.add(t13);

        a1.setBounds(250 + 0 * 83 + 20, 95 + 15 + 130, 83, 120);
        a1.setBackground(Color.DARK_GRAY);
        a1.setVisible(true);
        a1.setBorder(null);
        a1.setOpaque(false);
        a1.setContentAreaFilled(false);
        a1.setBorderPainted(false);

        board.add(a1);
        a2.setBounds(playergridxx + 1 * 83 + 20, playergridyy + 15 + 130, 83, 120);
        a2.setBackground(Color.DARK_GRAY);
        a2.setBorder(null);
        a2.setOpaque(false);
        a2.setContentAreaFilled(false);
        a2.setBorderPainted(false);

        board.add(a2);
        a3.setBounds(playergridxx + 2 * 83 + 20, playergridyy + 15 + 130, 83, 120);
        a3.setBackground(Color.DARK_GRAY);
        a3.setBorder(null);
        a3.setOpaque(false);
        a3.setContentAreaFilled(false);
        a3.setBorderPainted(false);

        board.add(a3);
        a4.setBounds(playergridxx + 3 * 83 + 20, playergridyy + 15 + 130, 83, 120);
        a4.setBackground(Color.DARK_GRAY);
        a4.setBorder(null);
        a4.setOpaque(false);
        a4.setContentAreaFilled(false);
        a4.setBorderPainted(false);

        board.add(a4);
        a5.setBounds(playergridxx + 4 * 83 + 20, playergridyy + 15 + 130, 83, 120);
        a5.setBackground(Color.DARK_GRAY);
        a5.setBorder(null);
        a5.setOpaque(false);
        a5.setContentAreaFilled(false);
        a5.setBorderPainted(false);

        board.add(a5);
        a6.setBounds(playergridxx + 5 * 83 + 20, playergridyy + 15 + 130, 83, 120);
        a6.setBackground(Color.DARK_GRAY);
        a6.setBorder(null);
        a6.setOpaque(false);
        a6.setContentAreaFilled(false);
        a6.setBorderPainted(false);

        board.add(a6);
        a7.setBounds(playergridxx + 6 * 83 + 20, playergridyy + 15 + 130, 83, 120);
        a7.setBackground(Color.DARK_GRAY);
        a7.setBorder(null);
        a7.setOpaque(false);
        a7.setContentAreaFilled(false);
        a7.setBorderPainted(false);

        board.add(a7);
        a8.setBounds(playergridxx + 7 * 83 + 20, playergridyy + 15 + 130, 83, 120);
        a8.setBackground(Color.DARK_GRAY);
        a8.setBorder(null);
        a8.setOpaque(false);
        a8.setContentAreaFilled(false);
        a8.setBorderPainted(false);

        board.add(a8);
        a9.setBounds(playergridxx + 8 * 83 + 20, playergridyy + 15 + 130, 83, 120);
        a9.setBackground(Color.GRAY);
        a9.setBorder(null);
        a9.setOpaque(false);
        a9.setContentAreaFilled(false);
        a9.setBorderPainted(false);

        board.add(a9);
        a10.setBounds(playergridxx + 9 * 83 + 20, playergridyy + 15 + 130, 83, 120);
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
        for (int i = 0; i < 26; i++) {
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

        for (int i = 0; i < 26; i++) {
            rand = new Random().nextInt(52);
            while (true) {
                if (allCards.get(rand).cardused == false) {
                    computer.add(allCards.get(rand));
                    allCards.get(rand).cardused = true;
                    break;
                } else {
                    rand = new Random().nextInt(52);
                }
            }
        }

        //check wheather it's working or not
        /*for (Cards c : you) {
            System.out.println("you have card " + c.name + " of " + c.shape + c.card_value);
        }
        for (Cards c : computer) {
            System.out.println("player1 has card " + c.name + " of " + c.shape + c.card_value);

        }
        for (Cards c : board_cards) {
            System.out.println("remain in board " + c.name + " of " + c.shape + c.card_value);
        }*/

        this.setIconImage(jicon);

        jf.setBackground(Color.DARK_GRAY);
        jf.setBounds(playergridx + 480, playergridy + playergridh + 5 + 110, 80, 45);
        jf.setVisible(true);
        jf.setFont(font);
        jf.setForeground(Color.yellow);
        jf.setBorder(null);
        jf.setEditable(false);
        this.add(jf);

        jfc.setBackground(Color.DARK_GRAY);
        jfc.setBounds(gridx + 325, 85, 80, 45);
        jfc.setVisible(true);
        jfc.setFont(font);
        jfc.setForeground(Color.yellow);
        jfc.setBorder(null);
        jfc.setEditable(false);
        this.add(jfc);

        jfb.setBackground(Color.DARK_GRAY);
        jfb.setBounds(0, 0, 300, 105);
        jfb.setVisible(true);
        jfb.setBackground(Color.black);
        jfb.setFont(font2);
        jfb.setForeground(Color.green);
        jfb.setOpaque(true);
        jfb.setEditable(false);
        jfb.setBorder(null);
        this.add(jfb);

        for (int y = 0; y < 26; y++) {
            isempty[y] = true;
        }

        p1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(0)) == true) {
                    maxx = maxi(you.get(0));
                } else {
                    board_cards.add(you.get(0));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p1.setVisible(false);
                jfb.setText("you played " + you.get(0).name + " of " + you.get(0).shape);
                disable();
                showcomp();

            }
        });

        p2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jfb.setText(" ");

                if (is(you.get(1)) == true) {

                    maxx = maxi(you.get(1));
                } else {
                    board_cards.add(you.get(1));
                }

                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p2.setVisible(false);
                jfb.setText("you played " + you.get(1).name + " of " + you.get(1).shape);

                showcomp();

            }
        });

        p3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jfb.setText(" ");

                if (is(you.get(2)) == true) {

                    maxx = maxi(you.get(2));
                } else {
                    board_cards.add(you.get(2));
                }

                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p3.setVisible(false);
                jfb.setText("you played " + you.get(2).name + " of " + you.get(2).shape);

                showcomp();

            }
        });

        p4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jfb.setText(" ");

                if (is(you.get(3)) == true) {

                    maxx = maxi(you.get(3));
                } else {
                    board_cards.add(you.get(3));
                }

                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p4.setVisible(false);
                jfb.setText("you played " + you.get(3).name + " of " + you.get(3).shape);

                showcomp();

            }
        });

        p5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jfb.setText(" ");

                if (is(you.get(4)) == true) {

                    maxx = maxi(you.get(4));
                } else {
                    board_cards.add(you.get(4));
                }

                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p5.setVisible(false);
                jfb.setText("you played " + you.get(4).name + " of " + you.get(4).shape);

                showcomp();

            }
        });

        p6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jfb.setText(" ");

                if (is(you.get(5)) == true) {

                    maxx = maxi(you.get(5));
                } else {
                    board_cards.add(you.get(5));
                }

                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p6.setVisible(false);
                jfb.setText("you played " + you.get(5).name + " of " + you.get(5).shape);

                showcomp();

            }
        });

        p7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(6)) == true) {
                    maxx = maxi(you.get(6));
                } else {
                    board_cards.add(you.get(6));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p7.setVisible(false);
                jfb.setText("you played " + you.get(6).name + " of " + you.get(6).shape);

                showcomp();

            }
        });

        p8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(7)) == true) {
                    maxx = maxi(you.get(7));
                } else {
                    board_cards.add(you.get(7));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p8.setVisible(false);
                jfb.setText("you played " + you.get(7).name + " of " + you.get(7).shape);

                showcomp();

            }
        });

        p9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(8)) == true) {
                    maxx = maxi(you.get(8));
                } else {
                    board_cards.add(you.get(8));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p9.setVisible(false);
                jfb.setText("you played " + you.get(8).name + " of " + you.get(8).shape);

                showcomp();

            }
        });

        p10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(9)) == true) {
                    maxx = maxi(you.get(9));
                } else {
                    board_cards.add(you.get(9));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p10.setVisible(false);
                jfb.setText("you played " + you.get(9).name + " of " + you.get(9).shape);

                showcomp();

            }
        });

        p11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(10)) == true) {
                    maxx = maxi(you.get(10));
                } else {
                    board_cards.add(you.get(10));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p11.setVisible(false);
                jfb.setText("you played " + you.get(10).name + " of " + you.get(10).shape);

                showcomp();

            }
        });

        p12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(11)) == true) {
                    maxx = maxi(you.get(11));
                } else {
                    board_cards.add(you.get(11));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p12.setVisible(false);
                jfb.setText("you played " + you.get(11).name + " of " + you.get(11).shape);

                showcomp();

            }
        });

        p13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(12)) == true) {
                    maxx = maxi(you.get(12));
                } else {
                    board_cards.add(you.get(12));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                p13.setVisible(false);
                jfb.setText("you played " + you.get(12).name + " of " + you.get(12).shape);

                showcomp();

            }
        });

        t1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(13)) == true) {
                    maxx = maxi(you.get(13));
                } else {
                    board_cards.add(you.get(13));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t1.setVisible(false);
                jfb.setText("you played " + you.get(13).name + " of " + you.get(13).shape);

                showcomp();

            }
        });

        t2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jfb.setText(" ");

                if (is(you.get(14)) == true) {

                    maxx = maxi(you.get(14));
                } else {
                    board_cards.add(you.get(14));
                }

                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t2.setVisible(false);
                jfb.setText("you played " + you.get(14).name + " of " + you.get(14).shape);

                showcomp();

            }
        });

        t3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jfb.setText(" ");

                if (is(you.get(15)) == true) {

                    maxx = maxi(you.get(15));
                } else {
                    board_cards.add(you.get(15));
                }

                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t3.setVisible(false);
                jfb.setText("you played " + you.get(15).name + " of " + you.get(15).shape);

                showcomp();

            }
        });

        t4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jfb.setText(" ");

                if (is(you.get(16)) == true) {

                    maxx = maxi(you.get(16));
                } else {
                    board_cards.add(you.get(16));
                }

                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t4.setVisible(false);
                jfb.setText("you played " + you.get(16).name + " of " + you.get(16).shape);

                showcomp();

            }
        });

        t5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jfb.setText(" ");

                if (is(you.get(17)) == true) {

                    maxx = maxi(you.get(17));
                } else {
                    board_cards.add(you.get(17));
                }

                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t5.setVisible(false);
                jfb.setText("you played " + you.get(17).name + " of " + you.get(17).shape);

                showcomp();

            }
        });

        t6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jfb.setText(" ");

                if (is(you.get(18)) == true) {

                    maxx = maxi(you.get(18));
                } else {
                    board_cards.add(you.get(18));
                }

                jf.setText(" ");
                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t6.setVisible(false);
                jfb.setText("you played " + you.get(18).name + " of " + you.get(18).shape);

                showcomp();

            }
        });

        t7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(19)) == true) {
                    maxx = maxi(you.get(19));
                } else {
                    board_cards.add(you.get(19));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t7.setVisible(false);
                jfb.setText("you played " + you.get(19).name + " of " + you.get(19).shape);

                showcomp();

            }
        });

        t8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(20)) == true) {
                    maxx = maxi(you.get(20));
                } else {
                    board_cards.add(you.get(20));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t8.setVisible(false);
                jfb.setText("you played " + you.get(20).name + " of " + you.get(20).shape);

                showcomp();

            }
        });

        t9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(21)) == true) {
                    maxx = maxi(you.get(21));
                } else {
                    board_cards.add(you.get(21));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t9.setVisible(false);
                jfb.setText("you played " + you.get(21).name + " of " + you.get(21).shape);

                showcomp();

            }
        });

        t10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(22)) == true) {
                    maxx = maxi(you.get(22));
                } else {
                    board_cards.add(you.get(22));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t10.setVisible(false);
                jfb.setText("you played " + you.get(22).name + " of " + you.get(22).shape);

                showcomp();

            }
        });

        t11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(23)) == true) {
                    maxx = maxi(you.get(23));
                } else {
                    board_cards.add(you.get(23));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t11.setVisible(false);
                jfb.setText("you played " + you.get(23).name + " of " + you.get(23).shape);

                showcomp();

            }
        });

        t12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(24)) == true) {
                    maxx = maxi(you.get(24));
                } else {
                    board_cards.add(you.get(24));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t12.setVisible(false);
                jfb.setText("you played " + you.get(24).name + " of " + you.get(24).shape);

                showcomp();

            }
        });

        t13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxx = 0;
                music("clicked.wav");
                jf.setText(" ");
                jfb.setText(" ");

                if (is(you.get(25)) == true) {
                    maxx = maxi(you.get(25));
                } else {
                    board_cards.add(you.get(25));
                }

                maxxi = maxxi + maxx;
                String str = Integer.toString(maxxi);
                jf.setText(str);
                t13.setVisible(false);
                jfb.setText("you played " + you.get(25).name + " of " + you.get(25).shape);

                showcomp();

            }
        });

    }

    public class Background extends JPanel {

        public void paintComponent(Graphics g) {

            g.drawImage(image, 0, 0, null);   //background image
            g.drawImage(image1, gridw - 250, 30, null);

            //g.setColor(Color.green);
            // g.drawRect(playergridxx-20, playergridyy+118, 900, 175);
            g.drawImage(image3, playergridxx - 20, playergridyy + 118, null);

            g.setColor(Color.DARK_GRAY);
            g.fillRect(playergridx + 385, playergridy + playergridh + 5 + 110, 170, 45);
            g.setFont(fontcard);
            g.setColor(Color.yellow);
            g.drawString("You : ", playergridx + 400, playergridy + playergridh + 38 + 110);

            g.setColor(Color.DARK_GRAY);
            g.fillRect(gridx + 185, gridy - 115, 220, 45);
            g.setFont(fontcard);
            g.setColor(Color.yellow);
            g.drawString("Computer : ", gridx + 195, gridy - 85);

            if (computer.isEmpty() == true) {
                jfb.setVisible(false);
                if (compscore > maxxi) {
                    g.setFont(dont);
                    g.setColor(Color.green);
                    g.drawString("Computer Wins", 270, 335);
                } else {
                    g.setFont(dont);
                    g.setColor(Color.green);
                    g.drawString("You Win", 430, 335);
                }
            }

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

            p7.setIcon(arrbutton[6]);

            p8.setIcon(arrbutton[7]);

            p9.setIcon(arrbutton[8]);

            p10.setIcon(arrbutton[9]);

            p11.setIcon(arrbutton[10]);

            p12.setIcon(arrbutton[11]);

            p13.setIcon(arrbutton[12]);

            t1.setIcon(arrbutton[13]);

            t2.setIcon(arrbutton[14]);

            t3.setIcon(arrbutton[15]);

            t4.setIcon(arrbutton[16]);

            t5.setIcon(arrbutton[17]);

            t6.setIcon(arrbutton[18]);

            t7.setIcon(arrbutton[19]);

            t8.setIcon(arrbutton[20]);

            t9.setIcon(arrbutton[21]);

            t10.setIcon(arrbutton[22]);

            t11.setIcon(arrbutton[23]);

            t12.setIcon(arrbutton[24]);

            t13.setIcon(arrbutton[25]);

            if (isempty[0] == false) {
                a1.setIcon(arrbutton1[0]);
            } else {
                a1.setIcon(null);
            }
            if (isempty[1] == false) {
                a2.setIcon(arrbutton1[1]);
            } else {
                a2.setIcon(null);
            }
            if (isempty[2] == false) {
                a3.setIcon(arrbutton1[2]);
            } else {
                a3.setIcon(null);
            }
            if (isempty[3] == false) {
                a4.setIcon(arrbutton1[3]);
            } else {
                a4.setIcon(null);
            }
            if (isempty[4] == false) {
                a5.setIcon(arrbutton1[4]);
            } else {
                a5.setIcon(null);
            }
            if (isempty[5] == false) {
                a6.setIcon(arrbutton1[5]);
            } else {
                a6.setIcon(null);
            }
            if (isempty[6] == false) {
                a7.setIcon(arrbutton1[6]);
            } else {
                a7.setIcon(null);
            }
            if (isempty[7] == false) {
                a8.setIcon(arrbutton1[7]);
            } else {
                a8.setIcon(null);
            }
            if (isempty[8] == false) {
                a9.setIcon(arrbutton1[8]);
            } else {
                a9.setIcon(null);
            }
            if (isempty[9] == false) {
                a10.setIcon(arrbutton1[9]);
            } else {
                a10.setIcon(null);
            }

        }
    }

    public boolean is(Cards crd) {
        boolean flag = false;

        for (Cards c : board_cards) {
            if (crd.symbol == c.symbol) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public int maxi(Cards crd) {
        int sum = crd.card_value, j = 0;
        for (Cards c : board_cards) {
            if (crd.symbol == c.symbol) {
                sum = sum + c.card_value;
                isempty[board_cards.size() - 1] = true;
                board_cards.remove(j);

                isempty[j] = true;

                break;
            }
            j++;
        }
        return sum;
    }

    public boolean iss(Cards crd) {
        boolean flag = false;
        int j = 0;
        for (Cards c : computer) {
            if (crd.symbol == c.symbol) {
                flag = true;
                summ = c.card_value + crd.card_value;
                s = c.shape;
                n = c.name;
                computer.remove(c);
                enable();
                break;
            }
            j++;
        }
        return flag;
    }

    public void maxin(Cards crd) {
        int j = 0;
        for (Cards c : board_cards) {
            if (crd.symbol == c.symbol) {
                isempty[board_cards.size() - 1] = true;
                board_cards.remove(j);

                isempty[j] = true;
                enable();

                break;
            }
            j++;
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

    public void disable() {
        p1.setEnabled(false);
        p2.setEnabled(false);
        p3.setEnabled(false);
        p4.setEnabled(false);
        p5.setEnabled(false);
        p6.setEnabled(false);
        p7.setEnabled(false);
        p8.setEnabled(false);
        p9.setEnabled(false);
        p10.setEnabled(false);
        p11.setEnabled(false);
        p12.setEnabled(false);
        p13.setEnabled(false);

        t1.setEnabled(false);
        t2.setEnabled(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
        t5.setEnabled(false);
        t6.setEnabled(false);
        t7.setEnabled(false);
        t8.setEnabled(false);
        t9.setEnabled(false);
        t10.setEnabled(false);
        t11.setEnabled(false);
        t12.setEnabled(false);
        t13.setEnabled(false);

    }

    public void enable() {
        p1.setEnabled(true);
        p2.setEnabled(true);
        p3.setEnabled(true);
        p4.setEnabled(true);
        p5.setEnabled(true);
        p6.setEnabled(true);
        p7.setEnabled(true);
        p8.setEnabled(true);
        p9.setEnabled(true);
        p10.setEnabled(true);
        p11.setEnabled(true);
        p12.setEnabled(true);
        p13.setEnabled(true);

        t1.setEnabled(true);
        t2.setEnabled(true);
        t3.setEnabled(true);
        t4.setEnabled(true);
        t5.setEnabled(true);
        t6.setEnabled(true);
        t7.setEnabled(true);
        t8.setEnabled(true);
        t9.setEnabled(true);
        t10.setEnabled(true);
        t11.setEnabled(true);
        t12.setEnabled(true);
        t13.setEnabled(true);

    }

    public void showcomp() {

        boolean f = false;
        int cmax = 0;

        for (Cards c : board_cards) {
            if (iss(c) == true) {
                cmax = summ;
                maxin(c);
                f = true;
                break;
            }
        }
        if (f == false) {
            board_cards.add(computer.get(0));
            s = computer.get(0).shape;
            n = computer.get(0).name;
            computer.remove(computer.get(0));

            enable();
        }
        compscore = compscore + cmax;
        String str1 = Integer.toString(compscore);
        jfc.setText(str1);
        jfb.setText("computer played " + n + " of " + s);
    }
}
