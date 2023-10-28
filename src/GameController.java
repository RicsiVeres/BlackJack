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
        //Dealer.Hit(Data.getDeck();
        // itt  mikor kiossza a lapokat mindenkinek!
        //plyernek 2 kartya
        int command = scan.nextInt();
        int Step;
        Step = 1;
        while (playing){
//            System.out.println(p);

            System.out.println(player.getCard());

            switch (command){
                case 0:
                    //Surrender
                    //Felad's
                    break;
                case 1:
                    //Hit
                    //Lapkeres


                    break;



                case 2:
                    //Stand/Stay
                    //nem ker tobb lapot
                    System.out.println("gggggggggggg");
                    break;
                case 10:
                    System.out.println("valami muvelet...");
                    System.out.println(Data.getDeck());
                    command = scan.nextInt();
                    break;
                default:
                    System.out.println("bla bla bla menu opciok...");
                    command = scan.nextInt();
                    break;

            }
        }
    }
}
