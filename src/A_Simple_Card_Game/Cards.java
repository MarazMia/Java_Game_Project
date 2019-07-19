package A_Simple_Card_Game;

public class Cards {

    int num;
    int card_value;
    int id;
    String shape;
    boolean cardused = false;
    String symbol;
    String name;

    //constructor for Cards class
    public Cards(int n, String s, int id) {
        this.num = n;
        this.shape = s;
        this.id = id;

        
        if (num == 2) {
            symbol = "2";
            name = "Two";

        } else if (num == 3) {
            symbol = "3";
            name = "Three";
        } else if (num == 4) {
            symbol = "4";
            name = "Four";
        } else if (num == 5) {
            symbol = "5";
            name = "Five";
        } else if (num == 6) {
            symbol = "6";
            name = "Six";
        } else if (num == 7) {
            symbol = "7";
            name = "Seven";
        } else if (num == 8) {
            symbol = "8";
            name = "Eight";
        } else if (num == 9) {
            symbol = "9";
            name = "Nine";
        } else if (num == 10) {
            symbol = "10";
            name = "Ten";
        } else if (num == 11) {
            symbol = "J";
            name = "JACK";
        } else if (num == 12) {
            symbol = "Q";
            name = "QUEEN";
        } else if (num == 13) {
            symbol = "K";
            name = "KING";
        } else {
            symbol = "A";
            name = "ACE";
        }
        
        
        
        if(s=="Diamonds" || s=="Hearts"){
            if (symbol == "A") {
                        card_value=1;
                    }
            else if (symbol == "2") {
                        card_value=2;
                    }
            else if (symbol == "3") {
                       card_value=3;
                    }
            else if (symbol == "4") {
                        card_value=4;
                    }
            else if (symbol == "5") {
                        card_value=5;
                    }
            else if (symbol == "6") {
                        card_value=6;
                    }
            else if (symbol == "7") {
                       card_value=7;
                    }
            else if (symbol == "8") {
                        card_value=8;
                    }
            else if (symbol == "9") {
                       card_value=9;
                    }
            else if (symbol == "10") {
                        card_value=10;
                    }
            else if (symbol == "J") {
                        card_value=10;
                    }
            else if (symbol == "Q") {
                       card_value=10;
                    }
            else if (symbol == "K") {
                       card_value=10;
                    }
        }
        else if(s=="Spades" && symbol=="A")
            card_value=10;
        else card_value=0;
        //check that the cards are being created
        //System.out.println("card "+name+" of "+shape+" created with id "+id);
    }
}
