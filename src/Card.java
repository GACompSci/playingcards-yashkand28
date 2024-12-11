public class Card {
    private int value; 
    private int suit; 
    private String name; 

    public Card() { 
        value = 0; 
        suit = 0; 
        name = "Joker"; 
    }

    private String generateName(int value, int suit){
        if (value == 0 || suit == 0){
            return "Joker"; 
        }

        String valueName = " "; 
        String suitName = " ";
        
        if (value == 1){
            valueName = "Ace"; 
        } 
        else if (value == 11){
            valueName = "Jack";
        }
        else if (value == 12){ 
            valueName = "Queen"; 
        }
        else if (value == 13){ 
            valueName = "King";
        }
        else{ 
            valueName = value + ""; 
        }

        if (suit == 1){
            suitName = "Hearts"; 
        }
        else if (suit == 2){
            suitName = "Diamonds";
        }
        else if (suit == 3){
            suitName = "Clubs"; 
        }
        else if (suit == 4){
            suitName = "Spades"; 
        }

        return valueName + " of " + suitName; 
    }

    public int getValue(){
        return value; 
    }

    public int getSuit(){
        return suit; 
    }

    public void setValue(int value){
        this.value = value; 
        name = generateName(value, suit);
    }

    public String toString(){
        return name; 
    }

    public Card(int value, int suit){
        this.value = value; 
        this.suit = suit; 
        name = generateName(value, suit);
    }

}
