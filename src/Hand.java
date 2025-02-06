import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand; 

    public Hand(int numCards, Deck LeDeck){
        hand = new ArrayList<>();
        for (int i = 0; i < numCards; i++){
            hand.add(LeDeck.drawCard());
        }
    }

    public int cardPresent(int value, int suit){
        for (Card LeCard : hand){
            if (LeCard.getValue() == value && LeCard.getSuit() == suit){
                return hand.indexOf(LeCard); 
            }
        }
        return -1; 
    }

    public Card playCard(int value, int suit){
        int cardIndex = cardPresent(value, suit);
        if (cardIndex != -1){
            Card drawnCard = hand.get(cardIndex);
            hand.remove(drawnCard);
            return drawnCard; 
        }
        return null; 
    }

    public void addCard(Card LeCard){
        hand.add(LeCard); 
    }

    public void printHand(){
        for (Card LeCard : hand){
            System.out.println(LeCard); 
        }
    }

    public void sortHand(){
        for (int i = 0; i < hand.size() - 1; i++){
            for (int j = i + 1; j < hand.size(); j++)
                if (hand.get(j).getValue() < hand.get(i).getValue()){
                    Card LeTemp = hand.get(i);
                    hand.set(i, hand.get(j));
                    hand.set(j, LeTemp); 
                }
        }
    }
    
}
