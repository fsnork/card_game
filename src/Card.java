import java.util.Arrays;
import java.util.List;

public class Card {

    private String nom;
    private String suit;
    private int value;

    public static List<String> nominals = Arrays.asList("6", "7", "8", "9", "10", "J", "Q", "K", "A");
    public static List<String> suits = Arrays.asList("Hearts", "Spades", "Diamonds", "Clubs");

    public Card(String nom, String suit) {
        if (nominals.contains(nom) && suits.contains(suit)) {
            this.nom = nom;
            this.suit = suit;
            this.value = 0;
            if (nom.matches("^-?\\d+$")) {
                this.value = Integer.parseInt(nom);
            } else {
                this.value = Value.valueOf(nom).getNumber();
            }
        }
    }

    public enum Value {
        J (11),
        Q (12),
        K (13),
        A (14);

        private final int number;

        Value(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return nom + " " + suit;
    }
}
