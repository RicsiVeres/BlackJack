import java.util.Scanner;

public class GameController {
    public void Play(String playerName){
        Dealer Dealer = new Dealer();
        Data Data = new Data();

        Player player = new Player(playerName);
        Player bot = new Player("Dealer");
        Data.Mix();
        boolean playing = true;
        Scanner scan = new Scanner(System.in);
        //Dealer.Hit(Data.getDeck();
        //dealer kiosztja a lapokat
        player.AddCard(Dealer.Hit(Data.getDeck()));
        player.AddCard(Dealer.Hit(Data.getDeck()));

        bot.AddCard(Dealer.Hit(Data.getDeck()));
        bot.AddCard(Dealer.Hit(Data.getDeck()));

        System.out.println(bot.getName() + " Lathato Kartyainak ponterteke: "+ bot.GetOneCard().getValue());
        System.out.println(bot.getName() + " Lapjai a kovetkezoek: "+ bot.GetOneCard().getName());
        System.out.println();
        System.out.println("A pontszamod: "+ player.getScore());
        System.out.println("A kovetkezo kartyak vannak a kezedben: "+ player.GetCardNames());
        System.out.println(" ");
        System.out.println("0.Exit  1.Hit  2.Stand/Stay");
        int command = scan.nextInt();

        while (playing){

            switch (command){
                case 0:
                    //Surrender
                    playing = false;
                    System.out.println("Feladtad!");
                    break;
                case 1:
                    //Hit
                    player.AddCard(Dealer.Hit(Data.getDeck()));
                    System.out.println("A pontszamod: "+ player.getScore());
                    System.out.println("A kovetkezo kartyak vannak a kezedben: "+ player.GetCardNames());
                    System.out.println(" ");
                    System.out.println("0.Exit  1.Hit  2.Stand/Stay");

                    if (bot.getScore() > 21 ){
                        System.out.println("Nyertel");
                        playing = false;
                        break;
                    } else if ( player.getScore() > 21 ) {
                        System.out.println("Vesztettel");
                        playing = false;
                        break;
                    }

                    command = scan.nextInt();
                    break;
                case 2:
                    //Stand/Stay
                    int step = 0;
                    if (bot.getScore() > 16){
                        System.out.println(bot.getName() + "Kartyai: "+ bot.GetCardNames());
                        System.out.println(bot.getName() + " Lapjai a kovetkezok: " + bot.GetCardNames());
                    }
                   while (bot.getScore()<= 16) {
                       if ( step != 0){
                           System.out.println();
                           System.out.println(bot.getName()+" Huzott meg egy lapot");
                           System.out.println();
                       }
                       bot.AddCard(Dealer.Hit(Data.getDeck()));
                       System.out.println(bot.getName() + " Pontszama: " + bot.getScore());
                       System.out.println(bot.getName() + " Lapjai a kovetkezok: " + bot.GetCardNames());
                       step++;
                   }
                   if (bot.getScore() > 21 || bot.getScore() < player.getScore()){
                       System.out.println("Nyertel");
                       playing = false;
                   } else if (bot.getScore() > player.getScore() || player.getScore() > 21 ) {
                       System.out.println("Vesztettel");
                       playing = false;
                   } else if (bot.getScore() == player.getScore()) {
                       System.out.println("Dontetlen");
                       playing = false;
                   }
                    break;
                case 3:
                    // new Game

                    break;
                default:
                    System.out.println(" ");
                    System.out.println("0.Exit  1.Hit  2.Stand/Stay");
                    command = scan.nextInt();
                    break;

            }
        }
    }
}
