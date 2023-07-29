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
                System.out.println("You have BlackJack");
                this.gameInput.close();
            } else if (Objects.equals(this.game, "ThreeCardPoker")) {
                System.out.println("You have ThreeCardPoker");
                this.gameInput.close();
            } else if (Objects.equals(this.game, "Roulette")) {
                System.out.println("You have Roulette");
                this.gameInput.close();
            } else {
                System.out.println("Please enter an available Game!");
                this.game = gameInput.nextLine();
                gameReferrer();
            }
    }
    }
