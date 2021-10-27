import java.util.ArrayList;

public class RandomCard {


    private static Object Card;

    public static Card getCard (ArrayList<Card> deck) {
        int n = (int)Math.floor(Math.random() * deck.size());
        ArrayList<Card> newDeck = new ArrayList<>();
        newDeck.add(deck.get(n));
        return newDeck.get(0);
    }
}