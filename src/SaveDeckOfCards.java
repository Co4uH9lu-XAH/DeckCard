import java.util.ArrayList;

public class SaveDeckOfCards {

    public static ArrayList<Card> saveDeck () {
        Card heartsSix = new Card("Six", "hearts", 6);
        Card heartsSeven = new Card("Seven", "hearts", 7);
        Card heartsEight = new Card("Eight", "hearts", 8);
        Card heartsNine = new Card("Nine", "hearts", 9);
        Card heartsTen = new Card("Ten", "hearts", 10);
        Card heartsJack = new Card("Jack", "hearts", 2);
        Card heartsQueen = new Card("Queen", "hearts", 3);
        Card heartsKing = new Card("King", "hearts", 4);
        Card heartsAce = new Card("Ace", "hearts", 11);

        Card diamondsSix = new Card("Six", "diamonds", 6);
        Card diamondsSeven = new Card("Seven", "diamonds", 7);
        Card diamondsEight = new Card("Eight", "diamonds", 8);
        Card diamondsNine = new Card("Nine", "diamonds", 9);
        Card diamondsTen = new Card("Ten", "diamonds", 10);
        Card diamondsJack = new Card("Jack", "diamonds", 2);
        Card diamondsQueen = new Card("Queen", "diamonds", 3);
        Card diamondsKing = new Card("King", "diamonds", 4);
        Card diamondsAce = new Card("Ace", "diamonds", 11);

        Card spadesSix = new Card("Six", "spades", 6);
        Card spadesSeven = new Card("Seven", "spades", 7);
        Card spadesEight = new Card("Eight", "spades", 8);
        Card spadesNine = new Card("Nine", "spades", 9);
        Card spadesTen = new Card("Ten", "spades", 10);
        Card spadesJack = new Card("Jack", "spades", 2);
        Card spadesQueen = new Card("Queen", "spades", 3);
        Card spadesKing = new Card("King", "spades", 4);
        Card spadesAce = new Card("Ace", "spades", 11);

        Card crossesSix = new Card("Six", "crosses", 6);
        Card crossesSeven = new Card("Seven", "crosses", 7);
        Card crossesEight = new Card("Eight", "crosses", 8);
        Card crossesNine = new Card("Nine", "crosses", 9);
        Card crossesTen = new Card("Ten", "crosses", 10);
        Card crossesJack = new Card("Jack", "crosses", 2);
        Card crossesQueen = new Card("Queen", "crosses", 3);
        Card crossesKing = new Card("King", "crosses", 4);
        Card crossesAce = new Card("Ace", "crosses", 11);

        ArrayList<Card> deckCard = new ArrayList<>();
        deckCard.add(heartsSix);
        deckCard.add(heartsSeven);
        deckCard.add(heartsEight);
        deckCard.add(heartsNine);
        deckCard.add(heartsTen);
        deckCard.add(heartsJack);
        deckCard.add(heartsQueen);
        deckCard.add(heartsKing);
        deckCard.add(heartsAce);

        deckCard.add(diamondsSix);
        deckCard.add(diamondsSeven);
        deckCard.add(diamondsEight);
        deckCard.add(diamondsNine);
        deckCard.add(diamondsTen);
        deckCard.add(diamondsJack);
        deckCard.add(diamondsQueen);
        deckCard.add(diamondsKing);
        deckCard.add(diamondsAce);

        deckCard.add(spadesSix);
        deckCard.add(spadesSeven);
        deckCard.add(spadesEight);
        deckCard.add(spadesNine);
        deckCard.add(spadesTen);
        deckCard.add(spadesJack);
        deckCard.add(spadesQueen);
        deckCard.add(spadesKing);
        deckCard.add(spadesAce);

        deckCard.add(crossesSix);
        deckCard.add(crossesSeven);
        deckCard.add(crossesEight);
        deckCard.add(crossesNine);
        deckCard.add(crossesTen);
        deckCard.add(crossesJack);
        deckCard.add(crossesQueen);
        deckCard.add(crossesKing);
        deckCard.add(crossesAce);

        return deckCard;
    }

}
