import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Card> deck;

    public Data() {
        this.deck = new ArrayList<>();
    }

    public void Mix(){
        deck.add(new Card("Ász", 11, 4));
        deck.add(new Card("Király", 10, 4));
        deck.add(new Card("Dáma", 10, 4));
        deck.add(new Card("Bubi", 10, 4));
        deck.add(new Card("2", 2, 4));
        deck.add(new Card("3", 3, 4));
        deck.add(new Card("4", 4, 4));
        deck.add(new Card("5", 5, 4));
        deck.add(new Card("6", 6, 4));
        deck.add(new Card("7", 7, 4));
        deck.add(new Card("8", 8, 4));
        deck.add(new Card("9", 9, 4));
        deck.add(new Card("10", 10, 4));
    }

    public List<Card> getDeck() {
        return deck;
    }
}
