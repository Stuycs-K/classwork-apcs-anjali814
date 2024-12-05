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

  public static void main(String[] args) {
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);
    drawBorder();
  }
}
