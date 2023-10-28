import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Player  {
    private String name;
    private int score;
    private  List<Card> cards;
    private Boolean secundAce = false;
    public Player(String Name){
        this.name = Name;
        this.score = 0;
        this.cards = new ArrayList<>();

    }
public void setSecondAceValueToEleven() {
     int aszSzam = 0;
     for (Card card : this.cards) {
        if (card.getName().equals("Ász") ) {
            aszSzam++;
            if (aszSzam == 2) {
                card.setValue(1);
            }
        } else if (score > 10) {
            card.setValue(1);
        }
     }

}

    public String CardNames(){
        String str = "";
        for (Card card : this.cards) {
            str +=  card.getName()+", ";
        }
        return  str;
    }
    public int getScore() {
        setSecondAceValueToEleven();
        int x = 0;
        for (Card card : this.cards) {
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
    public void AddCard(Card NewCard){
        cards.add(NewCard);
    }

}


