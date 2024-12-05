import java.util.Random;
public class Driver{

  public static void drawBorder() {
    for (int col = 0; col < 80; col++) {
      Text.go(1, col + 1);
      Text.color(Text.RED, Text.CYAN);
      System.out.print("~");
    }

    for (int col = 0; col < 80; col++) {
      Text.go(30, col + 1);
      Text.color(Text.RED, Text.CYAN);
      System.out.print("~");
    }

    for (int row = 1; row < 30; row++) {
      Text.go(row + 1, 1);
      Text.color(Text.RED, Text.CYAN);
      System.out.print("*");
      Text.go(row + 1, 80);
      System.out.print("*");
    }
  }

  public static int[] RandomNumbers() {
      Random random = new Random();
      int[] numbers = new int[3];
      for (int i = 0; i < 3; i++) {
          numbers[i] = random.nextInt(100);
      }
      return numbers;
  }

  public static void ColorNumbers(int numbers){
    if (numbers < 25) {
      Text.color(Text.BRIGHT, Text.RED);
    } else if (numbers > 75) {
      Text.color(Text.BRIGHT, Text.GREEN);
    } else {
      Text.color(Text.BRIGHT, Text.WHITE);
    }
    System.out.print(String.format("%2d ", numbers));
  }

  public static void DisplayNumbers(int[] numbers){
    int first = 80 / 2 - 20;;
    int second = first + 20;
    int third = second + 20;
    Text.go(2, first);
    ColorNumbers(numbers[0]);

    Text.go(2, second);
    ColorNumbers(numbers[1]);

    Text.go(2, third);
    ColorNumbers(numbers[2]);
  }

  public static void Separator() {
    Text.color(Text.RED, Text.YELLOW);
    Text.go(3, 1);
    for (int col = 1; col <= 80; col++) {
      System.out.print("=");
    }
    System.out.println();
  }




  public static void main(String[] args) {
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);

    int[] numbers = RandomNumbers();
    DisplayNumbers(numbers);
    Separator();
    drawBorder();

    Text.go(31, 1);
    System.out.println();

    System.out.print(Text.RESET);
    System.out.print(Text.SHOW_CURSOR);
  }
}
