import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("---------------- Welcome to hell! Wanna play? ----------------\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name, bastard: ");
        Player player1 = new Player(reader.readLine());
        System.out.println("Enter your name, bastard: ");
        Player player2 = new Player(reader.readLine());
        List<String> names = Arrays.asList(player1.name, player2.name);

        System.out.println("Let's see.. So, here we are:  " + names.get(0) +
                " aaaaaaaand " + names.get(1) + "\n");

        Game game = new Game(player1, player2);
        Deck deck = new Deck();
        deck.shuffle();
        game.start(deck, game.player1, game.player2);
        deck.clear();
    }
}