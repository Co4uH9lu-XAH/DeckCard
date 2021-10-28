public class Card {
     final String card;
     final String suit;
     final int nominal;

    public Card(String card, String suit, int nominal) {
        this.card = card;
        this.suit = suit;
        this.nominal = nominal;
    }
    public String toString() {
        return this.card + " " + this.suit;

    }
}
