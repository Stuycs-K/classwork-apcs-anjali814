public class Warrior extends Adventurer{
  private int rage;

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
    this.rage = n;
  }

  public int getSpecialMax(){
    return 100;
  }

  public String attack(Adventurer other){
    int damage = 5;
    other.applyDamage(damage);
    return this.getName() + " attacks " + other.getName() + "with a damage of " + damage;
  }

  public String support(Adventurer other);{
    int heal = 5;
    other.applyDamage(-heal);
    return this.getName() + " heals " + other.getName() + "by" + heals;
  }

  public String support(){
    int heal = 5;
    this.applyDamage(-heal);
    return this.getName() + "heals by " + heal;
  }
}
