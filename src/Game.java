public class Game {

    public Player player1;
    public Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(Deck deck, Player player1, Player player2) {
        while (!deck.cards.isEmpty()) {
            Card card1 = deck.getNextCard();
            Card card2 = deck.getNextCard();
            System.out.println("These are your cards: ");
            System.out.println(player1.name + "  " + card1.getCardName());
            System.out.println(player2.name + "  " + card2.getCardName());
            int value1 = card1.getValue();
            int value2 = card2.getValue();
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
            System.out.println("\n");
        }
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
