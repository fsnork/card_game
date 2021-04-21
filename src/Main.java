import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Game game = new Game();
        Deck deck = new Deck();
        deck.shuffle();
        game.start(deck, game.player1, game.player2);
        deck.clear();

    }
}