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
/*
  public abstract int getSpecialMax(){

  }
  public abstract String attack(Adventurer other){
    int damage = 5;
    other.
  }
  */
}
