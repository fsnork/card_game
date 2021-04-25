public class Card {

    private final Nominal nom;
    private final Suit suit;
    private final int value;


    public Card(Nominal nom, Suit suit) {
        this.nom = nom;
        this.suit = suit;
        this.value = nom.getNumber();
    }

    public String getCardName() {
        String first = (nom.getNumber() > 10) ? nom.toString() : Integer.toString(nom.getNumber());
        return first + " " + suit.getWord();
    }

    public int getValue() {
        return value;
    }

    public enum Nominal {
        SIX (6),
        SEVEN (7),
        EIGHT (8),
        NINE (9),
        TEN (10),
        J (11),
        Q (12),
        K (13),
        A (14);

        private final int number;

        Nominal(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

    public enum Suit {
        H ("Hearts"),
        S ("Spades"),
        D ("Diamonds"),
        C ("Clubs");

        private final String word;

        Suit(String word) {
            this.word = word;
        }

        public String getWord() {
            return word;
        }
    }
}
