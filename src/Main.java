
import java.util.*;

public class Main {
    public static void main(String[] args) {

        GameController gameController = new GameController();
        Scanner scan = new Scanner(System.in);
        System.out.println("Add meg a neved: ");
        String name= scan.next();
        System.out.println("Stop-Kilépés");
        String command = scan.next();
        while (command != "stop"){
            gameController.Play(name);
        }

    }

}