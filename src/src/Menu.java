import Games.BlackJack;
import Games.Roulette;
import Games.ThreeCardPoker;

import java.util.Objects;
import java.util.Scanner;

public class Menu {

    Scanner gameInput;
    String game;

    public Menu(){

    }
    public void gameSelector(){
         this.gameInput= new Scanner(System.in);
         System.out.println("BlackJack, ThreeCardPoker, Roulette");
         this.game = gameInput.nextLine();

    }

    public void gameReferrer(){
            if (Objects.equals(this.game, "BlackJack")){
                this.gameInput.close();
                BlackJack.start();
            } else if (Objects.equals(this.game, "ThreeCardPoker")) {
                this.gameInput.close();
                ThreeCardPoker.start();
            } else if (Objects.equals(this.game, "Roulette")) {
                this.gameInput.close();
                Roulette.start();
            } else {
                System.out.println("Please enter an available Game!");
                this.game = gameInput.nextLine();
                gameReferrer();
            }
    }
    }
