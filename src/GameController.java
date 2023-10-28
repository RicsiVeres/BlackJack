import java.util.Scanner;

public class GameController {
    public void Play(){
        Dealer Dealer = new Dealer();
        Data Data = new Data();

        Player player = new Player("ricsi");
        Player bot = new Player("Jani");
        Data.Mix();
        boolean playing = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("0.Exit  1.Hit   2.Stand/Stay ");
        int command = scan.nextInt();
        while (playing){


            switch (command){
                case 0:
//                    Feladás
                    playing = false;
                    System.out.println("Vesztettel!");
                    break;
                case 1:
//                      Lapkeres    Hit
                    player.AddCard(Dealer.Hit(Data.getDeck()));// kezebeadtuk a kartyat
                    System.out.println("Pontszámod: "+player.getScore());
                    System.out.println("Lapok a kezedben: "+player.CardNames());

                    if (player.getScore() > 21){
                        playing = false;
                    }else {
                        command = scan.nextInt();
                    }
                    break;



                case 2:
//                    Stand/Stay
                    System.out.println("gggggggggggg");
                    break;
                case 10:

                    break;
                default:
                    System.out.println("0.Exit  1.Hit   2.Stand/Stay ");
                    command = scan.nextInt();
                    break;

            }
        }
        if (player.getScore() > 21){
            System.out.println("Vesztettel!");
        } else if (bot.getScore() > 21) {
            System.out.println("Szépmunka, Nyertél!");
        }
    }
}
