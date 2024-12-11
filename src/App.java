public class App {
    public static void main(String[] args) throws Exception {
        for (int suit = 1; suit <= 4; suit++){
            for (int value = 1; value <= 13; value++){
                Card LeCard = new Card(value, suit);
                System.out.println(LeCard); 
            }
        }

        Card LeJoker1 = new Card(); 
        Card LeJoker2 = new Card();
        System.out.println(LeJoker1);
        System.out.println(LeJoker2);
    }
}