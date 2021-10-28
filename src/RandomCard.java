import java.util.ArrayList;
import java.util.Random;

public class RandomCard {


    //private static Object Card;

    public static Card getCard (ArrayList<Card> deck) {
        Random generator = new Random();
        int r = generator.nextInt(deck.size());
        int n = (int)Math.floor(Math.random() * deck.size());
        ArrayList<Card> newDeck = new ArrayList<>();
        newDeck.add(deck.get(n));
        deck.remove(n);
        return newDeck.get(0);
    }

}