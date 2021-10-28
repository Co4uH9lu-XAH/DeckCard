import java.util.ArrayList;

public class GiveMeCard {

    public static void main(String[] args) {
        ArrayList<Card> deck = SaveDeckOfCards.saveDeck();
        ArrayList<Card> newDeck = new ArrayList<>();
        newDeck.add(RandomCard.getCard(deck));
        System.out.println(newDeck.toString());
    }

}
