public class Driver {
  public static void main (String [] args){
    Adventurer warrior1 = new Warrior("Bobby", 50);
    Adventurer warrior2 = new Warrior("Ana", 60);

    System.out.println(warrior1.getName() + " has " + warrior1.getHP() + " HP.");
    System.out.println(warrior2.getName() + " has " + warrior2.getHP() + " HP.");

    System.out.println(warrior1.attack(warrior2));
    System.out.println(warrior2.support(warrior1));

    System.out.println(warrior1.support());

    warrior1.restoreSpecial(20);
    System.out.println(warrior1.specialAttack(warrior2));

    System.out.println(warrior1.getName() + " has " + warrior1.getHP() + " HP and " + warrior1.getSpecial() + " rage.");
    System.out.println(warrior2.getName() + " has " + warrior2.getHP() + " HP and " + warrior2.getSpecial() + " rage.");
  }
}
