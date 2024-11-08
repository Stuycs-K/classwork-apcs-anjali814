/* When we overrode getName to print "The Mighty NAME" instead of
   just "NAME" for birds, calling speak() on a bird object caused the System
   to print the "The Mighty NAME" instead of "NAME".
   The third one where the Animal is assigned to the Bird variable failed.
   It failed because not every Animal is a Bird but Bird is a subclass of Animal.
   In terms of "is-a," an Animal does not necessarily mean it "is-a" Bird. */
   
public class Driver {
  public static void main(String[] args) {
    Animal doggo = new Animal("bark", 2, "Charlie");
    doggo.speak();

    Bird birdie = new Bird("chirp", 3, "Coco", 4, "purple");
    birdie.speak();

    Animal a1 = new Animal("roar", 5, "Leo");
    a1.speak();
    System.out.println();

    Bird b1 = new Bird("chirp", 2, "Polly", 10.5, "red");
    b1.speak();
    System.out.println();

    /*
    Bird b2 = new Animal("Meow", 4, "Tom");
    b2.speak();
    System.out.println();
    */

    Animal a2 = new Bird("twit", 3, "Tweety", 8.5, "blue");
    a2.speak();
    System.out.println();

  }
}
