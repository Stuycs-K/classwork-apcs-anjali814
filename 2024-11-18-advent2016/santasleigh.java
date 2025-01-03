import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class santasleigh{
  public static int easterBunnyHQ(String filename){
    int [] xcoordinate = {0, 1, 0, -1};
    int [] ycoordinate = {1, 0, -1, 0};

    int x = 0;
    int y = 0;
    int currentDirection = 0;

    ArrayList<String> visitedlocations = new ArrayList<>();
    visitedlocations.add("0,0");

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      String direction = input.nextLine();
      String[] moves = direction.split(", ");

      for (int i = 0; i < moves.length; i++){
        String move = moves[i];
        char turn = move.charAt(0);
        int steps = Integer.parseInt(move.substring(1));

        if (turn == 'L') {
          currentDirection = (currentDirection + 3) % 4;
        } else if (turn == 'R') {
          currentDirection = (currentDirection + 1) % 4;
        }

        for (int j = 0; j < steps; j++){
          x += xcoordinate[currentDirection];
          y += ycoordinate[currentDirection];

          String currentLocation = x + "," + y;
          if (visitedlocations.contains(currentLocation)){
            input.close();
            return Math.abs(x) + Math.abs(y);
          } else {
            visitedlocations.add(currentLocation);
          }
        }
      }
      input.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filename);
      return 0;
    }
    return 0;
  }

  public static void main(String[] args) {
    String filename = "inputSleigh.txt";
    int bunnyHQ = easterBunnyHQ(filename);
    System.out.println(bunnyHQ);
    }
}
