public class Bird extends Animal {
  private double height;
  private String color;

  public Bird(String noise, int age, String name, double height, String color){
    super(noise, age, name);
    this.height = height;
    this.color = color;
  }

  public void speak(){
    super.speak();
    System.out.println ("My feather are colored "+ color + ".");
    System.out.println ("I am "+ height + " inches tall");
  }

  public String getName() {
    return "The Mighty " + super.getName();
  }
}
