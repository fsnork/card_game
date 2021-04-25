import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> cards = new ArrayList<Card>();

    public Deck() {
        for (Card.Nominal nom : Card.Nominal.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                this.cards.add(new Card(nom, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void clear() {
        cards.clear();
    }

    public Card getNextCard() {
        Card nextCard = cards.get(0);
        cards.remove(0);
        return nextCard;
    }
}
