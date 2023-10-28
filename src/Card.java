public class Card {
    private String name;
    private int value;



    private int quantity;
    public Card(String name, int value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int x) {
        this.quantity = quantity+x;
    }
}
