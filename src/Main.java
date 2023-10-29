
import java.util.*;

public class Main {
    public static void main(String[] args) {

        GameController gameController = new GameController();
        Scanner scan = new Scanner(System.in);
        System.out.println("Add meg a neved: ");
        String name= scan.next();
        String command  = "";
        System.out.println("A jatek elindult");
        while (command != "stop"){
            System.out.println();
            System.out.println();
            gameController.Play(name);
            System.out.println();
            System.out.println("Új játék kezdődött");
            System.out.println();
            System.out.println();
        }

    }

}