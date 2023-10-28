import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Player  {
    private String name;
    private int score;
    private  List<Card> cards;
    public Player(String Name){
        this.name = Name;
        this.score = 0;
        this.cards = new ArrayList<>();

    }
    public int getScore() {
        for (Card card : cards) {
            score += card.getQuantity();
        }
        return this.score;
    }
    public String getName() {
        return this.name;
    }

    public List<Card> getCard() {
        System.out.println("Pontszamos: "+getScore());
        return this.cards;
    }
    public void AddCard(Card NewCard){
        cards.add(NewCard);
    }

}


