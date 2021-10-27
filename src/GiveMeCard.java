import java.util.ArrayList;

public class GiveMeCard {

    public static void main(String[] args) {
        ArrayList<Card> deck = SaveDeckOfCards.saveDeck();
        ArrayList<Card> newDeck = new ArrayList<>();
        for (int i = 0; i<36; i++)
        newDeck.add(RandomCard.getCard(deck));
        newDeck.toString();
    }
}
