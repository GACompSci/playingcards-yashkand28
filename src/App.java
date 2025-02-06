public class App {
    public static void main(String[] args) throws Exception { 
        Deck deck = new Deck(); 
        Hand hand = new Hand(5, deck); 
        
        hand.sortHand();  
        hand.printHand();
    }
}