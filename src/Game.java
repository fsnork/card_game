import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    public Player player1;
    public Player player2;

    public Game() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---------------- Welcome to hell! Wanna play? ----------------\n");
        System.out.println("Enter your name, bastard: ");
        player1 = new Player(reader.readLine());
        System.out.println("Enter your name, the second bastard: ");
        player2 = new Player(reader.readLine());
        System.out.println("Let's see.. So, here we are:  " + player1.name +
                " aaaaaaaand " + player2.name + "\n");
    }

    public void start(Deck deck, Player player1, Player player2) {
        if (!deck.cards.isEmpty()) {
            deck.give(player1, player2);
            Card card1 = player1.currentCard;
            Card card2 = player2.currentCard;
            int value1 = card1.getValue();
            int value2 = card2.getValue();
            System.out.println("These are your cards: ");
            System.out.println(player1.name + "  " + card1);
            System.out.println(player2.name + "  " + card2);
            if (value1 == value2) {
                System.out.println("A-ha!");
            } else {
                if (value1 > value2) {
                    player1.amount += 2;
                    System.out.println(player1.name + " is going to kick your ass, " + player2.name);
                } else {
                    player2.amount += 2;
                    System.out.println(player2.name + " is going to kick your ass, " + player1.name);
                }
            }
            start(deck, player1, player2);
        } else {
            System.out.println("\n");
            System.out.println("---------------- Game Over! ----------------\n");
            if (player1.amount == player2.amount) {
                System.out.println("It's a DRAW motherfuckers");
            } else {
                Player winner = player1.amount > player2.amount ? player1 : player2;
                winner.win();
                Player looser = player1.amount > player2.amount ? player2 : player1;
                looser.fail();
            }
        }
    }
}
