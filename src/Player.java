public class Player {

    public String name;
    public int amount;
    public Card currentCard;

    public Player(String name) {
        this.name = name;
        this.amount = 0;
    }

    public void win() {
        System.out.println(name + ", you lucky piece of shit, congrats!");
    }

    public void fail() {
        System.out.println("Well, shit.. " + name + ", you failed.");
    }
}
