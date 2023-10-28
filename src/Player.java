public class Player  {
    private String name;
    private int score;
    private Data cards;

    public Player(String Name){
        this.name = Name;
        this.score = 0;
        this.cards = new Data();
    }
    public int getScore() {
        return this.score;
    }
    public String getName() {
        return this.name;
    }
    public Data getCard() {
        return this.cards;
    }



}


