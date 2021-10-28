public record Card(String card, String suit, int nominal) {

    public String toString() {
        return this.card + " " + this.suit;

    }
}
