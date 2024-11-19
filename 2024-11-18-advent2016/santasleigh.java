import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class santasleigh{
  public static int easterBunnyHQ(String filename){
    int [] xcoordinate = {-1, 0, 1, 0};
    int [] ycoordinate = {0, 1, 0, -1};

    int x = 0;
    int y = 0;
    int currentDirection = 0;

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      String direction = input.nextLine();

      for (int i = 0; i < direction.length(); i++){
        char turn = direction.charAt(i);
        int steps = Integer.parseInt(direction.substring(i+1));
        if (turn == 'L') {
          currentDirection = (currentDirection + 3) % 4;
        } else if (turn == 'R') {
          currentDirection = (currentDirection + 1) % 4;
        }
        x += xcoordinate[currentDirection] * steps;
        y += ycoordinate[currentDirection] * steps;
      }
      input.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filename);
      return 0;
    }
    return Math.abs(x) + Math.abs(y);
  }

  public static void main(String[] args) {
    String filename = "inputSleigh.txt";
    int bunnyHQ = easterBunnyHQ(filename);
    System.out.println(bunnyHQ);
    }
}
