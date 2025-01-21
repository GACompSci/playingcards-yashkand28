public class App {
    public static void main(String[] args) throws Exception { 
        Deck deck = new Deck();

        for (Card c : deck.getDeck()){
            System.out.println(c);
        }

        System.out.println("The first drawn card is: " + deck.drawCard());
        System.out.println("The second drawn card is: " + deck.drawCard());
        System.out.println(deck);
    }
}