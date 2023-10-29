import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dealer {

    public Card Hit(List<Card> deck) {
        if (deck.isEmpty()) {
            System.out.println("Nincs tobb kartya");
        }

        Random random = new Random();
        int randomIndex = random.nextInt(deck.size());

        // Véletlenszerű kártya kihúzása
        Card randomCard;
        if (deck.get(randomIndex).getQuantity() > 1){
            randomCard = deck.get(randomIndex);
        }else {
            randomCard = deck.remove(randomIndex);
            System.out.println(randomCard.getName()+"Elfogyott");
        }
        randomCard.setQuantity(-1);
//
//        if (!deck.isEmpty()) {
//            System.out.println("Kihúzott kártya:");
//            System.out.println("Név: " + randomCard.getName());
//            System.out.println("Érték: " + randomCard.getValue());
//            System.out.println("Darabszám: " + randomCard.getQuantity());
//        } else {
//            System.out.println("Nincs több kártya a pakliban.");
//        }
        return randomCard;
    }

}
