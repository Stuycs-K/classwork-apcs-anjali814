import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bathroomsecurity{
  public static String bathroomCode(String filename){
    int x = 1;
    int y = 1;

    String code = "";

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while (input.hasNextLine()){
        String direction = input.nextLine();
        for (int i = 0; i < direction.length(); i++){
          char move = direction.charAt(i);
          int newX = x;
          int newY = y;

          if (move == 'U') {
            newX = x - 1;
          } else if (move == 'D') {
            newX = x + 1;
          } else if (move == 'L') {
            newY = y - 1;
          } else if (move == 'R') {
            newY = y + 1;
          }

          if (newX >= 0 && newX < 3 && newY >= 0 && newY < 3) {
            x = newX;
            y = newY;
          }
        }
        code += (3 * x + y + 1);
      }
      input.close();
    } catch (FileNotFoundException e){
      System.out.println("File not found: " + filename);
      return null;
    }
    return code;
  }

  public static void main(String[] args) {
    String filename = "inputCode.txt";
    System.out.println(bathroomCode(filename));
  }

}
