import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> cards = new ArrayList<Card>();

    public Deck() {
        for (String nom : Card.nominals) {
            for (String suit : Card.suits) {
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

    public void give(Player player1, Player player2) {
        player1.currentCard = cards.get(0);
        cards.remove(0);
        player2.currentCard = cards.get(0);
        cards.remove(0);
    }
}
