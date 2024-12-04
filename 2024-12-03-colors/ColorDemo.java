public class ColorDemo{
  public static final String CLEAR_SCREEN = "\u001b[2J";
  public static final String HIDE_CURSOR = "\u001b[?25l";
  public static final String SHOW_CURSOR = "\u001b[?25h";

  public static final String RESET = "\u001b[0m";
  public static final String WHITE = "\u001b[37m";
  public static final String BLACK = "\u001b[30m";
  public static final String RED = "\u001b[31m";
  public static final String YELLOW = "\u001b[33m";
  public static final String GREEN = "\u001b[32m";
  public static final String CYAN = "\u001b[36m";
  public static final String BLUE = "\u001b[34m";
  public static final String MAGENTA = "\u001b[35m";

  public static final String[] COLORS = {
    RED, GREEN, BLUE, YELLOW, CYAN, MAGENTA, WHITE, BLACK
  };

  public static void main (String[] args){
    int duration = 1000;
    int colorIndex = 0;
    int iterations = 60;
    
    for (int i = 0; i < iterations; i++) {
    System.out.println(RED + "this text is red" + RESET);
  }

}
