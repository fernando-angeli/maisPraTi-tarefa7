package ListasDuplamenteEncadeadas.Exercicio_5;

public class Card {

    private char playingCard;
    private Suits suit;

    public Card(char playingCard, Suits suit) {
        this.playingCard = Character.toUpperCase(playingCard);
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "["+playingCard + "-" + suit+"]";
    }
}
