import java.util.ArrayList;
import java.util.List;

public class Player  {
    private String name;
    private int score;
    private List<Card> cards;

    public Player(String Name){
        this.name = Name;
        this.score = 0;
        this.cards = new ArrayList<>();
    }

    public void setSecondAceValueToEleven() {
        int aszSzam = 0;

        for (Card card : this.cards) {
            if (card.getName().equals("Ász")) {
                aszSzam++;
                if (aszSzam == 2) {
                    card.setValue(11);
                } else if (score > 10) {
                    card.setValue(11);
                }
            }
        }
    }
    public  Card GetOneCard(){
        return cards.get(0);
    }
    public String GetCardNames(){
        String str = "";
        for (Card card: cards) {
            str += card.getName() + ", ";
        }
        return str;
    }
    public void AddCard(Card kartya){
        cards.add(kartya);
    }

    public int getScore() {
        int x = 0;
        for (Card card: cards) {
            setSecondAceValueToEleven();
            x += card.getValue();
        }
        return x;
    }
    public String getName() {
        return this.name;
    }
    public List<Card> getCard() {
        return this.cards;
    }



}


