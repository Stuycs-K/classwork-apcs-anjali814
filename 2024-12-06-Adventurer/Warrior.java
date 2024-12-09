public class Warrior extends Adventurer{
  private int rage;

  public Warrior (String name){
    super(name);
    this.rage = 0;
  }

  public Warrior (String name, int hp){
    super(name, hp);
    this.rage = 0;
  }


  public String getSpecialName(){
    return "rage";
  }

  public int getSpecial(){
    return rage;
  }

  public void setSpecial(int n){
    if (n < 0) {
      this.rage = 0;
    } else {
      this.rage = n;
    }
  }

  public int getSpecialMax(){
    return 100;
  }


  public String attack(Adventurer other){
    int damage = 5;
    other.applyDamage(damage);
    return this.getName() + " attacks " + other.getName() + " with a damage of " + damage;
  }

  public String support(Adventurer other){
    int heal = 5;
    other.setHP(other.getHP() + heal);
    return this.getName() + " heals " + other.getName() + "by" + heal;
  }

  public String support(){
    int heal = 10;
    this.setHP(this.getHP() + heal);
    return this.getName() + " heals by " + heal;
  }

  public String specialAttack(Adventurer other){
    if (this.getSpecial() >= 20){
      int damage = 30;
      other.applyDamage(damage);
      this.setSpecial(this.getSpecial() - 20);
      return this.getName() + " specially attacks " + other.getName() + " for " + damage + " damage.";
    } else {
      return this.getName() + " rage isn't enough for a special attack.";
    }
  }
}
