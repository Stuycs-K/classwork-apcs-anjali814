import java.util.Scanner;

public class Game{
  public static void main(String[] args){

    Adventurer enemy = new CodeWarrior ("Kevin", 50, "english");
    Adventurer player = new Warrior ("Susie", 50);

    Scanner userinput = new Scanner(System.in);

    while (enemy.getHP() > 0 && player.getHP() > 0){
      System.out.println("Player " + player + " Hp:" + player.getHP() + " Special attack: " + player.getSpecialName());
      System.out.println("Enemy " + enemy + " Hp: " + enemy.getHP() + "Special attack " + enemy.getSpecialName());

      System.out.println("Enter: (a)ttack / (sp)ecial / (su)pport / quit");
      if ( == 'a' || 'attack'){

      } 
    }
  }
}
