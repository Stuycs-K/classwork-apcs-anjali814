import java.util.Scanner;

public class Game{
  public static void main(String[] args){

    Adventurer enemy = new CodeWarrior ("Kevin", 50, "java");
    Adventurer player = new Warrior ("Susie", 50);

    Scanner userinput = new Scanner(System.in);

    while (enemy.getHP() > 0 && player.getHP() > 0){
      System.out.println("Player " + player + " Hp:" + player.getHP() + " Special attack: " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println("Enemy " + enemy + " Hp: " + enemy.getHP() + " Special attack: " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());

      System.out.println("Enter: (a)ttack / (sp)ecial / (su)pport / quit");
      String user = userinput.nextLine().toLowerCase();

      while (!(user.equals("a") || user.equals("attack")
        || user.equals("sp") || user.equals("special")
        || user.equals("su") || user.equals("support")
        || user.equals("quit"))){
          System.out.println("invalid. Type: (a)ttack / (sp)ecial / (su)pport / quit");
          user = userinput.nextLine().toLowerCase();
        }

        if (user.equals("a") || user.equals("attack")) {
          System.out.println(player.attack(enemy));
        } else if (user.equals("sp") || user.equals("special")) {
          System.out.println(player.specialAttack(enemy));
        } else if (user.equals("su") || user.equals("support")) {
          System.out.println(player.support());
        } else if (user.equals("quit")) {
          System.out.println("exiting game");
          return;
        }

        if (player.getHP() <= 0) {
          System.out.println(player.getName() + " has been defeated. game over!");
          return;
        } else if (enemy.getHP() <= 0) {
          System.out.println(enemy.getName() + " has been defeated. you win!");
          return;
        }

        user.close();
      }
    }
  }
